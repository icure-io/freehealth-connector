package be.cin.mycarenet._1_0.carenet.types;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "SingleNurseContractualCareUpdateType",
   propOrder = {"careReceiverDetail", "nurseContractualCareUpdateDetail", "nurseContractualCarePreviousDetail"}
)
@XmlRootElement(
   name = "SingleNurseContractualCareUpdate"
)
public class SingleNurseContractualCareUpdate implements Serializable {
   private static final long serialVersionUID = 1L;
   @XmlElement(
      name = "CareReceiverDetail",
      required = true
   )
   protected ExtCareReceiverDetailType careReceiverDetail;
   @XmlElement(
      name = "NurseContractualCareUpdateDetail",
      required = true
   )
   protected NurseContractualCareUpdateDetail nurseContractualCareUpdateDetail;
   @XmlElement(
      name = "NurseContractualCarePreviousDetail",
      required = true
   )
   protected NurseContractualCareDetailType nurseContractualCarePreviousDetail;
   @XmlAttribute(
      name = "MessageName",
      required = true
   )
   protected MessageNameType messageName;
   @XmlAttribute(
      name = "Version",
      required = true
   )
   protected String version;
   @XmlAttribute(
      name = "Duplicate",
      required = true
   )
   protected boolean duplicate;
   @XmlAttribute(
      name = "TestFlag",
      required = true
   )
   protected boolean testFlag;
   @XmlAttribute(
      name = "SenderReference",
      required = true
   )
   protected String senderReference;
   @XmlAttribute(
      name = "ReceiverReference"
   )
   protected String receiverReference;
   @XmlAttribute(
      name = "Synchronous",
      required = true
   )
   protected boolean synchronous;

   public SingleNurseContractualCareUpdate() {
   }

   public ExtCareReceiverDetailType getCareReceiverDetail() {
      return this.careReceiverDetail;
   }

   public void setCareReceiverDetail(ExtCareReceiverDetailType value) {
      this.careReceiverDetail = value;
   }

   public NurseContractualCareUpdateDetail getNurseContractualCareUpdateDetail() {
      return this.nurseContractualCareUpdateDetail;
   }

   public void setNurseContractualCareUpdateDetail(NurseContractualCareUpdateDetail value) {
      this.nurseContractualCareUpdateDetail = value;
   }

   public NurseContractualCareDetailType getNurseContractualCarePreviousDetail() {
      return this.nurseContractualCarePreviousDetail;
   }

   public void setNurseContractualCarePreviousDetail(NurseContractualCareDetailType value) {
      this.nurseContractualCarePreviousDetail = value;
   }

   public MessageNameType getMessageName() {
      return this.messageName;
   }

   public void setMessageName(MessageNameType value) {
      this.messageName = value;
   }

   public String getVersion() {
      return this.version;
   }

   public void setVersion(String value) {
      this.version = value;
   }

   public boolean isDuplicate() {
      return this.duplicate;
   }

   public void setDuplicate(boolean value) {
      this.duplicate = value;
   }

   public boolean isTestFlag() {
      return this.testFlag;
   }

   public void setTestFlag(boolean value) {
      this.testFlag = value;
   }

   public String getSenderReference() {
      return this.senderReference;
   }

   public void setSenderReference(String value) {
      this.senderReference = value;
   }

   public String getReceiverReference() {
      return this.receiverReference;
   }

   public void setReceiverReference(String value) {
      this.receiverReference = value;
   }

   public boolean isSynchronous() {
      return this.synchronous;
   }

   public void setSynchronous(boolean value) {
      this.synchronous = value;
   }
}
