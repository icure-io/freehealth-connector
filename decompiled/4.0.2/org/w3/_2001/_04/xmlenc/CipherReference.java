package org.w3._2001._04.xmlenc;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "CipherReferenceType",
   propOrder = {"transforms"}
)
@XmlRootElement(
   name = "CipherReference"
)
public class CipherReference implements Serializable {
   private static final long serialVersionUID = 1L;
   @XmlElement(
      name = "Transforms"
   )
   protected TransformsType transforms;
   @XmlAttribute(
      name = "URI",
      required = true
   )
   @XmlSchemaType(
      name = "anyURI"
   )
   protected String uri;

   public CipherReference() {
   }

   public TransformsType getTransforms() {
      return this.transforms;
   }

   public void setTransforms(TransformsType value) {
      this.transforms = value;
   }

   public String getURI() {
      return this.uri;
   }

   public void setURI(String value) {
      this.uri = value;
   }
}
