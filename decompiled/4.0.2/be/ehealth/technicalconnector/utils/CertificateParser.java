package be.ehealth.technicalconnector.utils;

import be.ehealth.technicalconnector.exception.TechnicalConnectorException;
import be.ehealth.technicalconnector.exception.TechnicalConnectorExceptionValues;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.naming.InvalidNameException;
import javax.naming.ldap.LdapName;
import javax.naming.ldap.Rdn;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.x500.style.BCStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CertificateParser {
   private static final Logger LOG = LoggerFactory.getLogger(CertificateParser.class);
   private static final String OU_EHP = "eHealth-platform Belgium";
   private static final String OU_FEDERAL_GOVERNMENT = "Federal Government";
   private static final String ORGANIZATION_UNIT_NAME_ATTRIBUTE_TYPE = "OU";
   private static final String COMMON_NAME_ATTRIBUTE_TYPE = "CN";
   private static final String SERIALNUMBER_OID_ATTRIBUTE_TYPE;
   private static final String NO_VALUE = "";
   private String type;
   private String id;
   private String application;
   private List<String> ouList;
   private List<String> cnList;

   public CertificateParser(X509Certificate cert) throws TechnicalConnectorException {
      this(cert.getSubjectX500Principal().getName("RFC2253"));
   }

   public CertificateParser(String subject) throws TechnicalConnectorException {
      this.type = "";
      this.id = "";
      this.application = "";
      this.ouList = new ArrayList();
      this.cnList = new ArrayList();
      LdapName name = null;

      try {
         name = new LdapName(subject);
      } catch (InvalidNameException var7) {
         LOG.error(TechnicalConnectorExceptionValues.INVALID_CERTIFICATE.getMessage(), var7);
         throw new TechnicalConnectorException(TechnicalConnectorExceptionValues.INVALID_CERTIFICATE, var7, new Object[0]);
      }

      if (this.processRDNs(name.getRdns()) != CertificateParser.CertType.EID) {
         Iterator var3 = this.ouList.iterator();

         while(true) {
            while(var3.hasNext()) {
               String ou = (String)var3.next();
               LOG.debug("Analysing OU:{}", ou);
               if (Pattern.matches("([A-Z(-|_)]+=[0-9]+)", ou)) {
                  String[] splittedOU = ou.split("=");
                  this.id = splittedOU[1];
                  this.type = splittedOU[0];
               } else if (!"eHealth-platform Belgium".equals(ou) && !"Federal Government".equals(ou)) {
                  LOG.debug("Analysing OU {} for ApplicationId.", ou);
                  Iterator var5 = this.cnList.iterator();

                  while(var5.hasNext()) {
                     String cn = (String)var5.next();
                     if (cn.endsWith(ou)) {
                        LOG.debug("ApplicationId is present.");
                        this.application = ou;
                     }
                  }
               }
            }

            return;
         }
      }
   }

   private CertType processRDNs(List<Rdn> rdnList) {
      Iterator var2 = rdnList.iterator();

      Rdn rdn;
      do {
         if (!var2.hasNext()) {
            return CertificateParser.CertType.NO_EID;
         }

         rdn = (Rdn)var2.next();
         if (rdn.getType().equals("OU")) {
            this.ouList.add(this.getValue(rdn.getValue()));
         }

         if (rdn.getType().equals("CN")) {
            this.cnList.add(this.getValue(rdn.getValue()));
         }
      } while(!rdn.getType().equals(SERIALNUMBER_OID_ATTRIBUTE_TYPE));

      this.type = IdentifierType.SSIN.getType(48);
      this.id = this.getValue(rdn.getValue());
      return CertificateParser.CertType.EID;
   }

   private String getValue(Object value) {
      if (value instanceof String) {
         return (String)value;
      } else if (value instanceof byte[]) {
         return this.convertToString((byte[])((byte[])value));
      } else {
         LOG.error("Unsupported value [{}]", value.getClass());
         return "";
      }
   }

   private String convertToString(byte[] value) {
      try {
         ASN1Primitive content = ASN1Primitive.fromByteArray(value);
         if (content instanceof DERPrintableString) {
            return ((DERPrintableString)content).getString();
         }

         LOG.error("Unsupported ASN1Object :{}", content.getClass());
      } catch (Exception var3) {
         LOG.error("Error while converting to String", var3);
      }

      return "";
   }

   public final String getType() {
      return this.type;
   }

   public final String getApplication() {
      return this.application;
   }

   public final IdentifierType getIdentifier() {
      return IdentifierType.lookup(this.type, (String)null, 48);
   }

   public final String getId() {
      return this.id;
   }

   static {
      SERIALNUMBER_OID_ATTRIBUTE_TYPE = BCStyle.SERIALNUMBER.getId();
   }

   private static enum CertType {
      EID,
      NO_EID;

      private CertType() {
      }
   }
}
