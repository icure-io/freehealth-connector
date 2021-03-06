package be.fgov.ehealth.hubservices.core.v3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "PutTransactionSetResponseType",
   propOrder = {"response", "acknowledge", "transactions"}
)
@XmlRootElement(
   name = "PutTransactionSetResponse",
   namespace = "http://www.ehealth.fgov.be/hubservices/protocol/v3"
)
public class PutTransactionSetResponse implements Serializable {
   private static final long serialVersionUID = 1L;
   @XmlElement(
      required = true
   )
   protected ResponseType response;
   @XmlElement(
      required = true
   )
   protected AcknowledgeType acknowledge;
   @XmlElement(
      name = "transaction"
   )
   protected List<TransactionIdType> transactions;

   public PutTransactionSetResponse() {
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

   public List<TransactionIdType> getTransactions() {
      if (this.transactions == null) {
         this.transactions = new ArrayList();
      }

      return this.transactions;
   }
}
