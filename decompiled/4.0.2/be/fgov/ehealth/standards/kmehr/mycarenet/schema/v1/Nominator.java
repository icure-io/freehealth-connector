package be.fgov.ehealth.standards.kmehr.mycarenet.schema.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "",
   propOrder = {"quantity"}
)
public class Nominator implements Serializable {
   private static final long serialVersionUID = 1L;
   @XmlElement(
      required = true
   )
   protected TimequantityType quantity;

   public Nominator() {
   }

   public TimequantityType getQuantity() {
      return this.quantity;
   }

   public void setQuantity(TimequantityType value) {
      this.quantity = value;
   }
}
