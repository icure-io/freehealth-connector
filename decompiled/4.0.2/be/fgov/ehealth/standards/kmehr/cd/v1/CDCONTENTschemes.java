package be.fgov.ehealth.standards.kmehr.cd.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(
   name = "CD-CONTENTschemes"
)
@XmlEnum
public enum CDCONTENTschemes {
   @XmlEnumValue("CD-LAB")
   CD_LAB("CD-LAB"),
   @XmlEnumValue("CD-TECHNICAL")
   CD_TECHNICAL("CD-TECHNICAL"),
   @XmlEnumValue("CD-HCPARTY")
   CD_HCPARTY("CD-HCPARTY"),
   @XmlEnumValue("CD-DRUG-CNK")
   CD_DRUG_CNK("CD-DRUG-CNK"),
   @XmlEnumValue("CD-ENCOUNTER")
   CD_ENCOUNTER("CD-ENCOUNTER"),
   @XmlEnumValue("CD-MKG-ADMISSION")
   CD_MKG_ADMISSION("CD-MKG-ADMISSION"),
   @XmlEnumValue("CD-MKG-DISCHARGE")
   CD_MKG_DISCHARGE("CD-MKG-DISCHARGE"),
   @XmlEnumValue("CD-MKG-ORIGIN")
   CD_MKG_ORIGIN("CD-MKG-ORIGIN"),
   @XmlEnumValue("CD-MKG-REFERRER")
   CD_MKG_REFERRER("CD-MKG-REFERRER"),
   @XmlEnumValue("CD-MKG-DESTINATION")
   CD_MKG_DESTINATION("CD-MKG-DESTINATION"),
   @XmlEnumValue("CD-LEGAL-SERVICE")
   CD_LEGAL_SERVICE("CD-LEGAL-SERVICE"),
   @XmlEnumValue("CD-CONTACT-PERSON")
   CD_CONTACT_PERSON("CD-CONTACT-PERSON"),
   @XmlEnumValue("CD-ENCOUNTER-TYPE")
   CD_ENCOUNTER_TYPE("CD-ENCOUNTER-TYPE"),
   @XmlEnumValue("CD-CARENET-ACCIDENT-TYPE")
   CD_CARENET_ACCIDENT_TYPE("CD-CARENET-ACCIDENT-TYPE"),
   @XmlEnumValue("CD-CARENET-AGREEMENT-TYPE")
   CD_CARENET_AGREEMENT_TYPE("CD-CARENET-AGREEMENT-TYPE"),
   @XmlEnumValue("CD-CARENET-SISCARD-ERROR")
   CD_CARENET_SISCARD_ERROR("CD-CARENET-SISCARD-ERROR"),
   @XmlEnumValue("CD-CARENET-SOCIAL-CODE")
   CD_CARENET_SOCIAL_CODE("CD-CARENET-SOCIAL-CODE"),
   @XmlEnumValue("CD-CARENET-REFUSAL-REASON")
   CD_CARENET_REFUSAL_REASON("CD-CARENET-REFUSAL-REASON"),
   @XmlEnumValue("CD-CARENET-NATIONAL-INSURANCE")
   CD_CARENET_NATIONAL_INSURANCE("CD-CARENET-NATIONAL-INSURANCE"),
   @XmlEnumValue("CD-CARENET-MESSAGE")
   CD_CARENET_MESSAGE("CD-CARENET-MESSAGE"),
   @XmlEnumValue("CD-CARENET-MUTATION-INDICATOR")
   CD_CARENET_MUTATION_INDICATOR("CD-CARENET-MUTATION-INDICATOR"),
   @XmlEnumValue("CD-CARENET-DOCUMENT")
   CD_CARENET_DOCUMENT("CD-CARENET-DOCUMENT"),
   @XmlEnumValue("CD-CARENET-INSURANCY-STATUS")
   CD_CARENET_INSURANCY_STATUS("CD-CARENET-INSURANCY-STATUS"),
   @XmlEnumValue("CD-CARENET-TYPE")
   CD_CARENET_TYPE("CD-CARENET-TYPE"),
   @XmlEnumValue("CD-MAA-TYPE")
   CD_MAA_TYPE("CD-MAA-TYPE"),
   @XmlEnumValue("CD-MAA-REQUESTTYPE")
   CD_MAA_REQUESTTYPE("CD-MAA-REQUESTTYPE"),
   @XmlEnumValue("CD-MAA-RESPONSETYPE")
   CD_MAA_RESPONSETYPE("CD-MAA-RESPONSETYPE"),
   @XmlEnumValue("CD-MAA-REFUSALJUSTIFICATION")
   CD_MAA_REFUSALJUSTIFICATION("CD-MAA-REFUSALJUSTIFICATION"),
   @XmlEnumValue("CD-MAA-COVERAGE-TYPE")
   CD_MAA_COVERAGE_TYPE("CD-MAA-COVERAGE-TYPE"),
   @XmlEnumValue("CD-SITE")
   CD_SITE("CD-SITE"),
   @XmlEnumValue("CD-INCAPACITY")
   CD_INCAPACITY("CD-INCAPACITY"),
   @XmlEnumValue("CD-ENCOUNTERSAFETYISSUE")
   CD_ENCOUNTERSAFETYISSUE("CD-ENCOUNTERSAFETYISSUE"),
   @XmlEnumValue("CD-EMERGENCYEVALUATION")
   CD_EMERGENCYEVALUATION("CD-EMERGENCYEVALUATION"),
   ICD("ICD"),
   ICPC("ICPC"),
   @XmlEnumValue("CD-CLINICAL")
   CD_CLINICAL("CD-CLINICAL"),
   LOCAL("LOCAL"),
   @XmlEnumValue("CD-ECARE-HAQVALUE")
   CD_ECARE_HAQVALUE("CD-ECARE-HAQVALUE"),
   @XmlEnumValue("CD-EBIRTH-PREGNANCYORIGIN")
   CD_EBIRTH_PREGNANCYORIGIN("CD-EBIRTH-PREGNANCYORIGIN"),
   @XmlEnumValue("CD-EBIRTH-SPECIALVALUES")
   CD_EBIRTH_SPECIALVALUES("CD-EBIRTH-SPECIALVALUES"),
   @XmlEnumValue("CD-EBIRTH-CHILDPOSITION")
   CD_EBIRTH_CHILDPOSITION("CD-EBIRTH-CHILDPOSITION"),
   @XmlEnumValue("CD-EBIRTH-FOETALMONITORING")
   CD_EBIRTH_FOETALMONITORING("CD-EBIRTH-FOETALMONITORING"),
   @XmlEnumValue("CD-EBIRTH-DELIVERYWAY")
   CD_EBIRTH_DELIVERYWAY("CD-EBIRTH-DELIVERYWAY"),
   @XmlEnumValue("CD-EBIRTH-CAESEREANINDICATION")
   CD_EBIRTH_CAESEREANINDICATION("CD-EBIRTH-CAESEREANINDICATION"),
   @XmlEnumValue("CD-EBIRTH-ARTIFICIALRESPIRATIONTYPE")
   CD_EBIRTH_ARTIFICIALRESPIRATIONTYPE("CD-EBIRTH-ARTIFICIALRESPIRATIONTYPE"),
   @XmlEnumValue("CD-EBIRTH-NEONATALDEPTTYPE")
   CD_EBIRTH_NEONATALDEPTTYPE("CD-EBIRTH-NEONATALDEPTTYPE"),
   @XmlEnumValue("CD-EBIRTH-CONGENITALMALFORMATION")
   CD_EBIRTH_CONGENITALMALFORMATION("CD-EBIRTH-CONGENITALMALFORMATION"),
   @XmlEnumValue("CD-VACCINEINDICATION")
   CD_VACCINEINDICATION("CD-VACCINEINDICATION"),
   @XmlEnumValue("CD-ATC")
   CD_ATC("CD-ATC"),
   @XmlEnumValue("CD-CAREPATH")
   CD_CAREPATH("CD-CAREPATH"),
   @XmlEnumValue("CD-CLINICALPLAN")
   CD_CLINICALPLAN("CD-CLINICALPLAN"),
   @XmlEnumValue("CD-PATIENTWILL")
   CD_PATIENTWILL("CD-PATIENTWILL"),
   @XmlEnumValue("CD-CONSENT")
   CD_CONSENT("CD-CONSENT"),
   @XmlEnumValue("CD-CHAPTER4PARAGRAPH")
   CD_CHAPTER_4_PARAGRAPH("CD-CHAPTER4PARAGRAPH"),
   @XmlEnumValue("CD-CHAPTER4CATEGORY")
   CD_CHAPTER_4_CATEGORY("CD-CHAPTER4CATEGORY"),
   @XmlEnumValue("CD-CHAPTER4CRITERIA")
   CD_CHAPTER_4_CRITERIA("CD-CHAPTER4CRITERIA"),
   @XmlEnumValue("CD-CHAPTER4VERSESEQAPPENDIX")
   CD_CHAPTER_4_VERSESEQAPPENDIX("CD-CHAPTER4VERSESEQAPPENDIX"),
   @XmlEnumValue("CD-CHAPTER4DOCUMENTSEQAPPENDIX")
   CD_CHAPTER_4_DOCUMENTSEQAPPENDIX("CD-CHAPTER4DOCUMENTSEQAPPENDIX"),
   @XmlEnumValue("CD-CHAPTER4VERSE")
   CD_CHAPTER_4_VERSE("CD-CHAPTER4VERSE"),
   @XmlEnumValue("CD-BVT-CONSERVATIONMODE")
   CD_BVT_CONSERVATIONMODE("CD-BVT-CONSERVATIONMODE"),
   @XmlEnumValue("CD-BVT-CONSERVATIONDELAY")
   CD_BVT_CONSERVATIONDELAY("CD-BVT-CONSERVATIONDELAY"),
   @XmlEnumValue("CD-BVT-AVAILABLEMATERIALS")
   CD_BVT_AVAILABLEMATERIALS("CD-BVT-AVAILABLEMATERIALS"),
   @XmlEnumValue("CD-BCR-DIFFERENTATIONDEGREE")
   CD_BCR_DIFFERENTATIONDEGREE("CD-BCR-DIFFERENTATIONDEGREE"),
   @XmlEnumValue("CD-BVT-SAMPLETYPE")
   CD_BVT_SAMPLETYPE("CD-BVT-SAMPLETYPE"),
   @XmlEnumValue("CD-BVT-LATERALITY")
   CD_BVT_LATERALITY("CD-BVT-LATERALITY"),
   @XmlEnumValue("CD-BVT-PATIENTOPPOSITION")
   CD_BVT_PATIENTOPPOSITION("CD-BVT-PATIENTOPPOSITION"),
   @XmlEnumValue("CD-BVT-STATUS")
   CD_BVT_STATUS("CD-BVT-STATUS"),
   @XmlEnumValue("CD-ITEM-REG")
   CD_ITEM_REG("CD-ITEM-REG"),
   @XmlEnumValue("CD-STENT-DOMINANCE")
   CD_STENT_DOMINANCE("CD-STENT-DOMINANCE"),
   @XmlEnumValue("CD-STENT-BRIDGETYPE")
   CD_STENT_BRIDGETYPE("CD-STENT-BRIDGETYPE"),
   @XmlEnumValue("CD-STENT-LESIONTYPE")
   CD_STENT_LESIONTYPE("CD-STENT-LESIONTYPE"),
   @XmlEnumValue("CD-STENT-SEGMENT")
   CD_STENT_SEGMENT("CD-STENT-SEGMENT"),
   @XmlEnumValue("CD-STENT-DEVICE")
   CD_STENT_DEVICE("CD-STENT-DEVICE"),
   @XmlEnumValue("CD-TUCO-PATHOLOGYTYPE")
   CD_TUCO_PATHOLOGYTYPE("CD-TUCO-PATHOLOGYTYPE"),
   @XmlEnumValue("CD-TUCO-STEMITYPE")
   CD_TUCO_STEMITYPE("CD-TUCO-STEMITYPE"),
   @XmlEnumValue("CD-BALLON-DEVICE")
   CD_BALLON_DEVICE("CD-BALLON-DEVICE"),
   @XmlEnumValue("CD-DISCHARGETYPE")
   CD_DISCHARGETYPE("CD-DISCHARGETYPE"),
   @XmlEnumValue("CD-REIMBURSEMENT-NOMENCLATURE")
   CD_REIMBURSEMENT_NOMENCLATURE("CD-REIMBURSEMENT-NOMENCLATURE"),
   @XmlEnumValue("ID-STENT-DEVICE")
   ID_STENT_DEVICE("ID-STENT-DEVICE"),
   @XmlEnumValue("CD-ORTHO-TYPE")
   CD_ORTHO_TYPE("CD-ORTHO-TYPE"),
   @XmlEnumValue("CD-ORTHO-DIAGNOSIS")
   CD_ORTHO_DIAGNOSIS("CD-ORTHO-DIAGNOSIS"),
   @XmlEnumValue("CD-ORTHO-APPROACH")
   CD_ORTHO_APPROACH("CD-ORTHO-APPROACH"),
   @XmlEnumValue("CD-ORTHO-NAVCOM")
   CD_ORTHO_NAVCOM("CD-ORTHO-NAVCOM"),
   @XmlEnumValue("CD-IMPLANTATION-DEVICE")
   CD_IMPLANTATION_DEVICE("CD-IMPLANTATION-DEVICE"),
   @XmlEnumValue("CD-BEARING-SURFACE")
   CD_BEARING_SURFACE("CD-BEARING-SURFACE"),
   @XmlEnumValue("CD-ORTHO-GRAFT")
   CD_ORTHO_GRAFT("CD-ORTHO-GRAFT"),
   @XmlEnumValue("CD-ORTHO-INTERFACE")
   CD_ORTHO_INTERFACE("CD-ORTHO-INTERFACE"),
   @XmlEnumValue("CD-ORTHO-TECHREVISION")
   CD_ORTHO_TECHREVISION("CD-ORTHO-TECHREVISION"),
   @XmlEnumValue("CD-IMPLANTATION-TYPE")
   CD_IMPLANTATION_TYPE("CD-IMPLANTATION-TYPE"),
   @XmlEnumValue("CD-ORTHO-KNEE-INSERT")
   CD_ORTHO_KNEE_INSERT("CD-ORTHO-KNEE-INSERT"),
   @XmlEnumValue("CD-REV-COMPONENT")
   CD_REV_COMPONENT("CD-REV-COMPONENT"),
   @XmlEnumValue("CD-ITEM-MS")
   CD_ITEM_MS("CD-ITEM-MS"),
   @XmlEnumValue("CD-EAN")
   CD_EAN("CD-EAN"),
   @XmlEnumValue("CD-MS-ORIGIN")
   CD_MS_ORIGIN("CD-MS-ORIGIN"),
   @XmlEnumValue("CD-MS-ADAPTATION")
   CD_MS_ADAPTATION("CD-MS-ADAPTATION"),
   @XmlEnumValue("CD-MS-MEDICATIONTYPE")
   CD_MS_MEDICATIONTYPE("CD-MS-MEDICATIONTYPE"),
   @XmlEnumValue("CD-NIHDI")
   CD_NIHDI("CD-NIHDI"),
   @XmlEnumValue("CD-SNOMED")
   CD_SNOMED("CD-SNOMED"),
   @XmlEnumValue("CD-DEFIB-TYPE")
   CD_DEFIB_TYPE("CD-DEFIB-TYPE"),
   @XmlEnumValue("CD-DEFIB-ARRHYTHMIA")
   CD_DEFIB_ARRHYTHMIA("CD-DEFIB-ARRHYTHMIA"),
   @XmlEnumValue("CD-DEFIB-SYMPTOM")
   CD_DEFIB_SYMPTOM("CD-DEFIB-SYMPTOM"),
   @XmlEnumValue("CD-DEFIB-AETIOLOGY")
   CD_DEFIB_AETIOLOGY("CD-DEFIB-AETIOLOGY"),
   @XmlEnumValue("CD-DEFIB-ANTECEDENT")
   CD_DEFIB_ANTECEDENT("CD-DEFIB-ANTECEDENT"),
   @XmlEnumValue("CD-DEFIB-PARAM")
   CD_DEFIB_PARAM("CD-DEFIB-PARAM"),
   @XmlEnumValue("CD-DEFIB-MEDICALCARE")
   CD_DEFIB_MEDICALCARE("CD-DEFIB-MEDICALCARE"),
   @XmlEnumValue("CD-DEFIB-AFFECTIONTYPE")
   CD_DEFIB_AFFECTIONTYPE("CD-DEFIB-AFFECTIONTYPE"),
   @XmlEnumValue("CD-DEFIB-RISK")
   CD_DEFIB_RISK("CD-DEFIB-RISK"),
   @XmlEnumValue("CD-DEFIB-INFARCTMOMENT")
   CD_DEFIB_INFARCTMOMENT("CD-DEFIB-INFARCTMOMENT"),
   @XmlEnumValue("CD-DEFIB-REVASCULARISATION")
   CD_DEFIB_REVASCULARISATION("CD-DEFIB-REVASCULARISATION"),
   @XmlEnumValue("CD-DEFIB-DRUGCARE")
   CD_DEFIB_DRUGCARE("CD-DEFIB-DRUGCARE"),
   @XmlEnumValue("CD-DEFIB-SYNCOPE")
   CD_DEFIB_SYNCOPE("CD-DEFIB-SYNCOPE"),
   @XmlEnumValue("CD-DEFIB-COMPLICATION")
   CD_DEFIB_COMPLICATION("CD-DEFIB-COMPLICATION"),
   @XmlEnumValue("CD-DEFIB-DIAGNOSIS")
   CD_DEFIB_DIAGNOSIS("CD-DEFIB-DIAGNOSIS"),
   @XmlEnumValue("CD-DEFIB-CONFIG")
   CD_DEFIB_CONFIG("CD-DEFIB-CONFIG"),
   @XmlEnumValue("CD-DEFIB-INDICATION")
   CD_DEFIB_INDICATION("CD-DEFIB-INDICATION"),
   @XmlEnumValue("CD-DEFIB-SURGERY")
   CD_DEFIB_SURGERY("CD-DEFIB-SURGERY"),
   @XmlEnumValue("CD-DEFIB-REASON")
   CD_DEFIB_REASON("CD-DEFIB-REASON"),
   @XmlEnumValue("CD-DEFIB-FIRM")
   CD_DEFIB_FIRM("CD-DEFIB-FIRM"),
   @XmlEnumValue("CD-DEFIB-ELEC-REASON")
   CD_DEFIB_ELEC_REASON("CD-DEFIB-ELEC-REASON"),
   @XmlEnumValue("CD-DEFIB-MODEL")
   CD_DEFIB_MODEL("CD-DEFIB-MODEL"),
   @XmlEnumValue("CD-DEFIB-ELEC-TYPE")
   CD_DEFIB_ELEC_TYPE("CD-DEFIB-ELEC-TYPE"),
   @XmlEnumValue("CD-DEFIB-RESULT")
   CD_DEFIB_RESULT("CD-DEFIB-RESULT"),
   @XmlEnumValue("CD-ASA-SCORE")
   CD_ASA_SCORE("CD-ASA-SCORE"),
   @XmlEnumValue("CD-QERMID-OPERATIONTYPE")
   CD_QERMID_OPERATIONTYPE("CD-QERMID-OPERATIONTYPE"),
   @XmlEnumValue("CD-QERMID-ALIGNMENT")
   CD_QERMID_ALIGNMENT("CD-QERMID-ALIGNMENT"),
   @XmlEnumValue("CD-QERMID-CUSTOMINSTRUMENT")
   CD_QERMID_CUSTOMINSTRUMENT("CD-QERMID-CUSTOMINSTRUMENT"),
   @XmlEnumValue("CD-QERMID-ORTHOPART")
   CD_QERMID_ORTHOPART("CD-QERMID-ORTHOPART"),
   @XmlEnumValue("CD-QERMID-SUBSTITUTE")
   CD_QERMID_SUBSTITUTE("CD-QERMID-SUBSTITUTE"),
   @XmlEnumValue("CD-QERMID-MODNECK-FRONTALVIEW")
   CD_QERMID_MODNECK_FRONTALVIEW("CD-QERMID-MODNECK-FRONTALVIEW"),
   @XmlEnumValue("CD-QERMID-MODNECK-LATERALVIEW")
   CD_QERMID_MODNECK_LATERALVIEW("CD-QERMID-MODNECK-LATERALVIEW"),
   @XmlEnumValue("CD-QERMID-MODNECK-OFFSET")
   CD_QERMID_MODNECK_OFFSET("CD-QERMID-MODNECK-OFFSET"),
   @XmlEnumValue("CD-QERMID-MAT-CATEGORY")
   CD_QERMID_MAT_CATEGORY("CD-QERMID-MAT-CATEGORY"),
   @XmlEnumValue("CD-QERMID-MAT-TYPE")
   CD_QERMID_MAT_TYPE("CD-QERMID-MAT-TYPE"),
   @XmlEnumValue("CD-QERMID-CEMENT")
   CD_QERMID_CEMENT("CD-QERMID-CEMENT"),
   @XmlEnumValue("CD-QERMID-INTERVENTION-SUBTYPE")
   CD_QERMID_INTERVENTION_SUBTYPE("CD-QERMID-INTERVENTION-SUBTYPE"),
   @XmlEnumValue("CD-MYCARENET-JUSTIFICATION")
   CD_MYCARENET_JUSTIFICATION("CD-MYCARENET-JUSTIFICATION"),
   @XmlEnumValue("CD-PM-SYMPTOM")
   CD_PM_SYMPTOM("CD-PM-SYMPTOM"),
   @XmlEnumValue("CD-PM-ECG")
   CD_PM_ECG("CD-PM-ECG"),
   @XmlEnumValue("CD-PM-AETIOLOGY")
   CD_PM_AETIOLOGY("CD-PM-AETIOLOGY"),
   @XmlEnumValue("CD-PM-INFOPRIMO")
   CD_PM_INFOPRIMO("CD-PM-INFOPRIMO"),
   @XmlEnumValue("CD-PM-STIMULATION")
   CD_PM_STIMULATION("CD-PM-STIMULATION"),
   @XmlEnumValue("CD-PM-REASON")
   CD_PM_REASON("CD-PM-REASON"),
   @XmlEnumValue("CD-PM-ABROAD-INDICATOR")
   CD_PM_ABROAD_INDICATOR("CD-PM-ABROAD-INDICATOR"),
   @XmlEnumValue("CD-PM-ELEC-TYPE")
   CD_PM_ELEC_TYPE("CD-PM-ELEC-TYPE"),
   @XmlEnumValue("CD-PM-ELEC-REASON")
   CD_PM_ELEC_REASON("CD-PM-ELEC-REASON"),
   @XmlEnumValue("CD-PM-CARDIOMYOPATHY")
   CD_PM_CARDIOMYOPATHY("CD-PM-CARDIOMYOPATHY"),
   @XmlEnumValue("CD-PM-DISTURBANCE")
   CD_PM_DISTURBANCE("CD-PM-DISTURBANCE"),
   @XmlEnumValue("CD-ACTS-NURSING")
   CD_ACTS_NURSING("CD-ACTS-NURSING"),
   @XmlEnumValue("CD-PM-INDICATION")
   CD_PM_INDICATION("CD-PM-INDICATION"),
   @XmlEnumValue("CD-TARDIS-REGISTRATIONTYPE")
   CD_TARDIS_REGISTRATIONTYPE("CD-TARDIS-REGISTRATIONTYPE"),
   @XmlEnumValue("CD-TARDIS-DIAGNOSIS")
   CD_TARDIS_DIAGNOSIS("CD-TARDIS-DIAGNOSIS"),
   @XmlEnumValue("CD-TARDIS-DRUG")
   CD_TARDIS_DRUG("CD-TARDIS-DRUG"),
   @XmlEnumValue("CD-TARDIS-DRUG-ENDREASON")
   CD_TARDIS_DRUG_ENDREASON("CD-TARDIS-DRUG-ENDREASON"),
   @XmlEnumValue("CD-TARDIS-DRUG-ROUTE")
   CD_TARDIS_DRUG_ROUTE("CD-TARDIS-DRUG-ROUTE"),
   @XmlEnumValue("CD-EBIRTH-CAESAREANINDICATION")
   CD_EBIRTH_CAESAREANINDICATION("CD-EBIRTH-CAESAREANINDICATION"),
   @XmlEnumValue("CD-NIHDI-RELATEDSERVICE")
   CD_NIHDI_RELATEDSERVICE("CD-NIHDI-RELATEDSERVICE"),
   @XmlEnumValue("CD-MYCARENET-REFUSAL")
   CD_MYCARENET_REFUSAL("CD-MYCARENET-REFUSAL"),
   @XmlEnumValue("CD-ISO-3950")
   CD_ISO_3950("CD-ISO-3950"),
   @XmlEnumValue("CD-TARDIS-PRODUCT-TYPE")
   CD_TARDIS_PRODUCT_TYPE("CD-TARDIS-PRODUCT-TYPE"),
   @XmlEnumValue("CD-AUTONOMY")
   CD_AUTONOMY("CD-AUTONOMY"),
   @XmlEnumValue("CD-CHAPTER4FORMALINTERPRETATION")
   CD_CHAPTER_4_FORMALINTERPRETATION("CD-CHAPTER4FORMALINTERPRETATION"),
   @XmlEnumValue("CD-PATIENTWILL-RES")
   CD_PATIENTWILL_RES("CD-PATIENTWILL-RES"),
   @XmlEnumValue("CD-PATIENTWILL-HOS")
   CD_PATIENTWILL_HOS("CD-PATIENTWILL-HOS"),
   @XmlEnumValue("CD-LEGALREFERENCE")
   CD_LEGALREFERENCE("CD-LEGALREFERENCE"),
   @XmlEnumValue("CD-LEGALTEXT")
   CD_LEGALTEXT("CD-LEGALTEXT"),
   @XmlEnumValue("CD-FORMALINTERPRETATION")
   CD_FORMALINTERPRETATION("CD-FORMALINTERPRETATION"),
   @XmlEnumValue("CD-REIMBURSEMENT-TERM-PARAMETER")
   CD_REIMBURSEMENT_TERM_PARAMETER("CD-REIMBURSEMENT-TERM-PARAMETER"),
   @XmlEnumValue("CD-REIMBURSEMENT-CONTEXT-ENVIRONMENT")
   CD_REIMBURSEMENT_CONTEXT_ENVIRONMENT("CD-REIMBURSEMENT-CONTEXT-ENVIRONMENT");

   private final String value;

   private CDCONTENTschemes(String v) {
      this.value = v;
   }

   public String value() {
      return this.value;
   }

   public static CDCONTENTschemes fromValue(String v) {
      CDCONTENTschemes[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         CDCONTENTschemes c = var1[var3];
         if (c.value.equals(v)) {
            return c;
         }
      }

      throw new IllegalArgumentException(v);
   }
}
