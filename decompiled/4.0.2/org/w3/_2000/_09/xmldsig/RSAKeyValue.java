package org.w3._2000._09.xmldsig;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "RSAKeyValueType",
   propOrder = {"modulus", "exponent"}
)
@XmlRootElement(
   name = "RSAKeyValue"
)
public class RSAKeyValue implements Serializable {
   private static final long serialVersionUID = 1L;
   @XmlElement(
      name = "Modulus",
      required = true
   )
   protected byte[] modulus;
   @XmlElement(
      name = "Exponent",
      required = true
   )
   protected byte[] exponent;

   public RSAKeyValue() {
   }

   public byte[] getModulus() {
      return this.modulus;
   }

   public void setModulus(byte[] value) {
      this.modulus = value;
   }

   public byte[] getExponent() {
      return this.exponent;
   }

   public void setExponent(byte[] value) {
      this.exponent = value;
   }
}
