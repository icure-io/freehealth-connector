package oasis.names.tc.saml._1_0.assertion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "EvidenceType",
   propOrder = {"assertionIDReferencesAndAssertions"}
)
@XmlRootElement(
   name = "Evidence"
)
public class Evidence implements Serializable {
   private static final long serialVersionUID = 1L;
   @XmlElementRefs({@XmlElementRef(
   name = "AssertionIDReference",
   namespace = "urn:oasis:names:tc:SAML:1.0:assertion",
   type = JAXBElement.class
), @XmlElementRef(
   name = "Assertion",
   namespace = "urn:oasis:names:tc:SAML:1.0:assertion",
   type = Assertion.class
)})
   protected List<Serializable> assertionIDReferencesAndAssertions;

   public Evidence() {
   }

   public List<Serializable> getAssertionIDReferencesAndAssertions() {
      if (this.assertionIDReferencesAndAssertions == null) {
         this.assertionIDReferencesAndAssertions = new ArrayList();
      }

      return this.assertionIDReferencesAndAssertions;
   }
}
