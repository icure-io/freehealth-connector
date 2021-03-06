package be.fgov.ehealth.standards.kmehr.mycarenet.cd.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(
   name = "CD-STENT-LESIONTYPEvalues"
)
@XmlEnum
public enum CDSTENTLESIONTYPEvalues {
   @XmlEnumValue("simple")
   SIMPLE("simple"),
   @XmlEnumValue("multi-segment")
   MULTI_SEGMENT("multi-segment"),
   @XmlEnumValue("aorto-ostiale")
   AORTO_OSTIALE("aorto-ostiale"),
   @XmlEnumValue("bifurcation")
   BIFURCATION("bifurcation"),
   @XmlEnumValue("occlusionchroniquetotplus3m")
   OCCLUSIONCHRONIQUETOTPLUS_3_M("occlusionchroniquetotplus3m");

   private final String value;

   private CDSTENTLESIONTYPEvalues(String v) {
      this.value = v;
   }

   public String value() {
      return this.value;
   }

   public static CDSTENTLESIONTYPEvalues fromValue(String v) {
      CDSTENTLESIONTYPEvalues[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         CDSTENTLESIONTYPEvalues c = var1[var3];
         if (c.value.equals(v)) {
            return c;
         }
      }

      throw new IllegalArgumentException(v);
   }
}
