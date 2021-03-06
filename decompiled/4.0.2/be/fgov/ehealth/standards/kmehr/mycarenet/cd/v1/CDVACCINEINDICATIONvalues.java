package be.fgov.ehealth.standards.kmehr.mycarenet.cd.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(
   name = "CD-VACCINEINDICATIONvalues"
)
@XmlEnum
public enum CDVACCINEINDICATIONvalues {
   @XmlEnumValue("poliomyelitis")
   POLIOMYELITIS("poliomyelitis"),
   @XmlEnumValue("measles")
   MEASLES("measles"),
   @XmlEnumValue("rubella")
   RUBELLA("rubella"),
   @XmlEnumValue("mumps")
   MUMPS("mumps"),
   @XmlEnumValue("seasonalinfluenza")
   SEASONALINFLUENZA("seasonalinfluenza"),
   @XmlEnumValue("hepatitisa")
   HEPATITISA("hepatitisa"),
   @XmlEnumValue("hepatitisb")
   HEPATITISB("hepatitisb"),
   @XmlEnumValue("rabies")
   RABIES("rabies"),
   @XmlEnumValue("varicella")
   VARICELLA("varicella"),
   @XmlEnumValue("rotavirus")
   ROTAVIRUS("rotavirus"),
   @XmlEnumValue("papillomavirus")
   PAPILLOMAVIRUS("papillomavirus"),
   @XmlEnumValue("yellowfever")
   YELLOWFEVER("yellowfever"),
   @XmlEnumValue("tickborneencephalitis")
   TICKBORNEENCEPHALITIS("tickborneencephalitis"),
   @XmlEnumValue("ej")
   EJ("ej"),
   @XmlEnumValue("diphteria")
   DIPHTERIA("diphteria"),
   @XmlEnumValue("tetanus")
   TETANUS("tetanus"),
   @XmlEnumValue("pertussis")
   PERTUSSIS("pertussis"),
   @XmlEnumValue("hib")
   HIB("hib"),
   @XmlEnumValue("meningitisc")
   MENINGITISC("meningitisc"),
   @XmlEnumValue("meningitis")
   MENINGITIS("meningitis"),
   @XmlEnumValue("pneumonia23")
   PNEUMONIA_23("pneumonia23"),
   @XmlEnumValue("pneumonia7")
   PNEUMONIA_7("pneumonia7"),
   @XmlEnumValue("tuberculosis")
   TUBERCULOSIS("tuberculosis"),
   @XmlEnumValue("typhoid")
   TYPHOID("typhoid"),
   @XmlEnumValue("pandemics")
   PANDEMICS("pandemics"),
   @XmlEnumValue("herpeszoster")
   HERPESZOSTER("herpeszoster"),
   @XmlEnumValue("cholera")
   CHOLERA("cholera"),
   @XmlEnumValue("covid19")
   COVID_19("covid19");

   private final String value;

   private CDVACCINEINDICATIONvalues(String v) {
      this.value = v;
   }

   public String value() {
      return this.value;
   }

   public static CDVACCINEINDICATIONvalues fromValue(String v) {
      CDVACCINEINDICATIONvalues[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         CDVACCINEINDICATIONvalues c = var1[var3];
         if (c.value.equals(v)) {
            return c;
         }
      }

      throw new IllegalArgumentException(v);
   }
}
