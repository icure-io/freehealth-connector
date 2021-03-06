package be.fgov.ehealth.standards.kmehr.mycarenet.cd.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(
   name = "CD-TEMPORALITYvalues"
)
@XmlEnum
public enum CDTEMPORALITYvalues {
   @XmlEnumValue("oneshot")
   ONESHOT("oneshot"),
   @XmlEnumValue("acute")
   ACUTE("acute"),
   @XmlEnumValue("chronic")
   CHRONIC("chronic"),
   @XmlEnumValue("reactivation")
   REACTIVATION("reactivation"),
   @XmlEnumValue("remission")
   REMISSION("remission"),
   @XmlEnumValue("subacute")
   SUBACUTE("subacute");

   private final String value;

   private CDTEMPORALITYvalues(String v) {
      this.value = v;
   }

   public String value() {
      return this.value;
   }

   public static CDTEMPORALITYvalues fromValue(String v) {
      CDTEMPORALITYvalues[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         CDTEMPORALITYvalues c = var1[var3];
         if (c.value.equals(v)) {
            return c;
         }
      }

      throw new IllegalArgumentException(v);
   }
}
