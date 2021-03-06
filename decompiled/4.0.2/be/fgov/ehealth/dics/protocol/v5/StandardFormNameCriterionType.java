package be.fgov.ehealth.dics.protocol.v5;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "StandardFormNameCriterionType",
   propOrder = {"value"}
)
public class StandardFormNameCriterionType implements Serializable {
   private static final long serialVersionUID = 1L;
   @XmlValue
   protected String value;
   @XmlAttribute(
      name = "Standard"
   )
   protected String standard;

   public StandardFormNameCriterionType() {
   }

   public String getValue() {
      return this.value;
   }

   public void setValue(String value) {
      this.value = value;
   }

   public String getStandard() {
      return this.standard;
   }

   public void setStandard(String value) {
      this.standard = value;
   }
}
