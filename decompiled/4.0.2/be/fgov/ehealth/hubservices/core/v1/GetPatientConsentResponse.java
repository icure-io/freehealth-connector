package be.fgov.ehealth.hubservices.core.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "GetPatientConsentResponseType",
   propOrder = {"response", "acknowledge", "consent"}
)
@XmlRootElement(
   name = "GetPatientConsentResponse",
   namespace = "http://www.ehealth.fgov.be/hubservices/protocol/v1"
)
public class GetPatientConsentResponse implements Serializable {
   private static final long serialVersionUID = 1L;
   @XmlElement(
      required = true
   )
   protected ResponseType response;
   @XmlElement(
      required = true
   )
   protected AcknowledgeType acknowledge;
   protected ConsentType consent;

   public GetPatientConsentResponse() {
   }

   public ResponseType getResponse() {
      return this.response;
   }

   public void setResponse(ResponseType value) {
      this.response = value;
   }

   public AcknowledgeType getAcknowledge() {
      return this.acknowledge;
   }

   public void setAcknowledge(AcknowledgeType value) {
      this.acknowledge = value;
   }

   public ConsentType getConsent() {
      return this.consent;
   }

   public void setConsent(ConsentType value) {
      this.consent = value;
   }
}
