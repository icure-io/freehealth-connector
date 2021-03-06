package be.fgov.ehealth.commons.enc.v2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "EncryptionMethodType"
)
@XmlRootElement(
   name = "EncryptionMethod"
)
public class EncryptionMethod implements Serializable {
   private static final long serialVersionUID = 1L;
   @XmlAttribute(
      name = "Algorithm",
      required = true
   )
   protected String algorithm;

   public EncryptionMethod() {
   }

   public String getAlgorithm() {
      return this.algorithm;
   }

   public void setAlgorithm(String value) {
      this.algorithm = value;
   }
}
