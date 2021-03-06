package org.w3._2000._09.xmldsig;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "SignaturePropertiesType",
   propOrder = {"signatureProperties"}
)
@XmlRootElement(
   name = "SignatureProperties"
)
public class SignatureProperties implements Serializable {
   private static final long serialVersionUID = 1L;
   @XmlElement(
      name = "SignatureProperty",
      required = true
   )
   protected List<SignatureProperty> signatureProperties;
   @XmlAttribute(
      name = "Id"
   )
   @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
   @XmlID
   @XmlSchemaType(
      name = "ID"
   )
   protected String id;

   public SignatureProperties() {
   }

   public List<SignatureProperty> getSignatureProperties() {
      if (this.signatureProperties == null) {
         this.signatureProperties = new ArrayList();
      }

      return this.signatureProperties;
   }

   public String getId() {
      return this.id;
   }

   public void setId(String value) {
      this.id = value;
   }
}
