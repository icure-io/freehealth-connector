package be.fgov.ehealth.mediprima.core.v2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "ConsultCarmedInterventionResultType",
   propOrder = {"carmedIdentifier", "carmedContent", "agreementNumber", "urgentMedicalAidAttestationNumber"}
)
public class ConsultCarmedInterventionResultType implements Serializable {
   private static final long serialVersionUID = 1L;
   @XmlElement(
      name = "CarmedIdentifier",
      required = true
   )
   protected CarmedIdentifierType carmedIdentifier;
   @XmlElement(
      name = "CarmedContent"
   )
   protected CarmedContentCareType carmedContent;
   @XmlElement(
      name = "AgreementNumber"
   )
   protected String agreementNumber;
   @XmlElement(
      name = "UrgentMedicalAidAttestationNumber"
   )
   protected String urgentMedicalAidAttestationNumber;

   public ConsultCarmedInterventionResultType() {
   }

   public CarmedIdentifierType getCarmedIdentifier() {
      return this.carmedIdentifier;
   }

   public void setCarmedIdentifier(CarmedIdentifierType value) {
      this.carmedIdentifier = value;
   }

   public CarmedContentCareType getCarmedContent() {
      return this.carmedContent;
   }

   public void setCarmedContent(CarmedContentCareType value) {
      this.carmedContent = value;
   }

   public String getAgreementNumber() {
      return this.agreementNumber;
   }

   public void setAgreementNumber(String value) {
      this.agreementNumber = value;
   }

   public String getUrgentMedicalAidAttestationNumber() {
      return this.urgentMedicalAidAttestationNumber;
   }

   public void setUrgentMedicalAidAttestationNumber(String value) {
      this.urgentMedicalAidAttestationNumber = value;
   }
}
