package be.fgov.ehealth.standards.kmehr.mycarenet.cd.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(
   name = "CD-ORTHO-TECHREVISIONvalues"
)
@XmlEnum
public enum CDORTHOTECHREVISIONvalues {
   @XmlEnumValue("femoralheadneck")
   FEMORALHEADNECK("femoralheadneck"),
   @XmlEnumValue("femoralcomplete")
   FEMORALCOMPLETE("femoralcomplete"),
   @XmlEnumValue("acetabularinsert")
   ACETABULARINSERT("acetabularinsert"),
   @XmlEnumValue("acetabularcomplete")
   ACETABULARCOMPLETE("acetabularcomplete");

   private final String value;

   private CDORTHOTECHREVISIONvalues(String v) {
      this.value = v;
   }

   public String value() {
      return this.value;
   }

   public static CDORTHOTECHREVISIONvalues fromValue(String v) {
      CDORTHOTECHREVISIONvalues[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         CDORTHOTECHREVISIONvalues c = var1[var3];
         if (c.value.equals(v)) {
            return c;
         }
      }

      throw new IllegalArgumentException(v);
   }
}
