package be.fgov.ehealth.standards.kmehr.cd.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(
   name = "CD-BCR-DIFFERENTATIONDEGREEvalues"
)
@XmlEnum
public enum CDBCRDIFFERENTATIONDEGREEvalues {
   @XmlEnumValue("welldifferentiated")
   WELLDIFFERENTIATED("welldifferentiated"),
   @XmlEnumValue("moderatelydifferentiated")
   MODERATELYDIFFERENTIATED("moderatelydifferentiated"),
   @XmlEnumValue("poorlydifferentiated")
   POORLYDIFFERENTIATED("poorlydifferentiated"),
   @XmlEnumValue("undifferentiatedanaplastic")
   UNDIFFERENTIATEDANAPLASTIC("undifferentiatedanaplastic"),
   @XmlEnumValue("tcell")
   TCELL("tcell"),
   @XmlEnumValue("bcell")
   BCELL("bcell"),
   @XmlEnumValue("nullcell")
   NULLCELL("nullcell"),
   @XmlEnumValue("nkcell")
   NKCELL("nkcell"),
   @XmlEnumValue("unknown")
   UNKNOWN("unknown");

   private final String value;

   private CDBCRDIFFERENTATIONDEGREEvalues(String v) {
      this.value = v;
   }

   public String value() {
      return this.value;
   }

   public static CDBCRDIFFERENTATIONDEGREEvalues fromValue(String v) {
      CDBCRDIFFERENTATIONDEGREEvalues[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         CDBCRDIFFERENTATIONDEGREEvalues c = var1[var3];
         if (c.value.equals(v)) {
            return c;
         }
      }

      throw new IllegalArgumentException(v);
   }
}
