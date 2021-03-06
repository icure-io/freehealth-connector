using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Runtime.InteropServices;

using be.business.connector.recipe.prescriber;
using be.business.connector.recipe.prescriber.mock;
using be.business.connector.recipe.prescriber.domain;
using be.recipe.services.prescriber;
using be.business.connector.core.utils;

namespace RecipePrescriberCom
{
    [InterfaceType(ComInterfaceType.InterfaceIsIDispatch)]
    public interface IGetPrescriptionResult
    {
        DateTime getCreationDate();

        string getEncryptionKeyId();

        string getPatientId();

        string getPrescription();

        string getRid();

        Boolean isFeedbackAllowed();

    }

    [ClassInterface(ClassInterfaceType.None)]
    public class GetPrescriptionResult : IGetPrescriptionResult
    {
        public DateTime creationDate { get; set; }

        public byte[] encryptionKey { get; set; }

        public string encryptionKeyId { get; set; }

        public string patientId { get; set; }

        public string prescription { get; set; }

        public string rid { get; set; }

        public Boolean feedbackAllowed { get; set; }

        public DateTime getCreationDate() { return creationDate; }

        public string getEncryptionKeyId() { return encryptionKeyId; }

        public string getPatientId() { return patientId; }

        public string getPrescription() { return prescription; }

        public string getRid() { return rid; }

        public Boolean isFeedbackAllowed() { return feedbackAllowed; }

    }


    [InterfaceType(ComInterfaceType.InterfaceIsIDispatch)]
    public interface IFeedback
    {
        DateTime getSentDate();

        string getContent();

        string getRid();

        string getSentBy();
    }


    [ClassInterface(ClassInterfaceType.None)]
    public class Feedback : IFeedback
    {
        public DateTime sentDate { get; set; }

        public string content { get; set; }

        public string sentBy { get; set; }

        public string rid { get; set; }

        public DateTime getSentDate()
        {
            return sentDate;
        }

        public string getContent()
        {
            return content;
        }

        public string getRid()
        {
            return rid;
        }

        public string getSentBy()
        {
            return sentBy;
        }
    }



    [InterfaceType(ComInterfaceType.InterfaceIsIDispatch)]
    public interface IRecipePrescriberModule
    {
        void init();

        void initMock();

        IGetPrescriptionResult getPrescription(String rid);

        void revokePrescription(string rid, string reason);

        string createPrescription(bool feedbackRequested, string patientId, string prescription, string prescriptionType);

        IFeedback[] listFeedbacks(bool readFlag);

        string[] listOpenPrescriptions();

        void prepareCreatePrescription(string patientId, string prescriptionType);

        void sendNotification(string notificationText, string patientId, string executorId);

        void setPersonalPassword(string personalPassword);

        void updateFeedbackFlag(string rid, bool feedbackAllowed);
    }


    [Guid("13FE32AD-4BF8-495f-AB4D-6C61B1233EA4")]
    [ClassInterface(ClassInterfaceType.None)]
    [ProgId("Recipe.RecipePrescriberModule")]
    public class RecipePrescriberModule : IRecipePrescriberModule
    {
        PrescriberIntegrationModule module;

        public void initMock()
        {
            module = new PrescriberIntegrationModuleMock();
        }


        public void init()
        {
            module = new PrescriberIntegrationModuleImpl();
        }

        public string createPrescription(bool feedbackRequested, string patientId, string prescription, string prescriptionType)
        {
            return module.createPrescription(feedbackRequested, patientId, new System.Text.ASCIIEncoding().GetBytes(prescription), prescriptionType);
        }


        public IGetPrescriptionResult getPrescription(String rid)
        {
            GetPrescriptionForPrescriberResult r = module.getPrescription(rid);
            GetPrescriptionResult ret = new GetPrescriptionResult();

            ret.creationDate = new DateTime(r.getCreationDate().get(java.util.Calendar.YEAR),
              r.getCreationDate().get(java.util.Calendar.MONTH) + 1,
              r.getCreationDate().get(java.util.Calendar.DAY_OF_MONTH),
              r.getCreationDate().get(java.util.Calendar.HOUR_OF_DAY),
              r.getCreationDate().get(java.util.Calendar.MINUTE),
              r.getCreationDate().get(java.util.Calendar.SECOND),
              r.getCreationDate().get(java.util.Calendar.MILLISECOND)
              );
            ret.encryptionKeyId = r.getEncryptionKeyId();
            ret.patientId = r.getPatientId();
            ret.prescription = IOUtils.strConvert(r.getPrescription());
            ret.rid = r.getRid();
            ret.feedbackAllowed = r.getFeedbackAllowed();

            return ret;
        }

        public void revokePrescription(string rid, string reason)
        {
            module.revokePrescription(rid, reason);
        }

        public IFeedback[] listFeedbacks(bool readFlag)
        {
            java.util.List feedbacks = module.listFeedback(readFlag);
            List<IFeedback> l = new List<IFeedback>();
            for (int i = 0; i < feedbacks.size(); i++)
            {

                be.recipe.services.prescriber.ListFeedbackItem item = (be.recipe.services.prescriber.ListFeedbackItem)feedbacks.get(i);
                Feedback n = new Feedback();
                n.rid = item.getRid();
                n.content = IOUtils.strConvert(item.getContent());
                n.sentBy = item.getSentBy();
                n.sentDate = new DateTime(item.getSentDate().get(java.util.Calendar.YEAR),
                   item.getSentDate().get(java.util.Calendar.MONTH) + 1,
                   item.getSentDate().get(java.util.Calendar.DAY_OF_MONTH),
                   item.getSentDate().get(java.util.Calendar.HOUR_OF_DAY),
                   item.getSentDate().get(java.util.Calendar.MINUTE),
                   item.getSentDate().get(java.util.Calendar.SECOND),
                   item.getSentDate().get(java.util.Calendar.MILLISECOND)
                   );
                l.Add(n);
            }
            return l.ToArray();
        }


        public string[] listOpenPrescriptions()
        {
            java.util.List list = module.listOpenPrescription();
            List<string> l = new List<string>();
            for (int i = 0; i < list.size(); i++)
            {
                l.Add(list.get(i).ToString());
            }
            return l.ToArray();
        }

        public void prepareCreatePrescription(string patientId, string prescriptionType)
        {
            module.prepareCreatePrescription(patientId, prescriptionType);
        }

        public void sendNotification(string notificationText, string patientId, string executorId)
        {
            module.sendNotification(new System.Text.ASCIIEncoding().GetBytes(notificationText), patientId, executorId);
        }

        public void setPersonalPassword(string personalPassword)
        {
            module.setPersonalPassword(personalPassword);
        }

        public void updateFeedbackFlag(string rid, bool feedbackAllowed)
        {
            module.updateFeedbackFlag(rid, feedbackAllowed);
        }


    }
}
