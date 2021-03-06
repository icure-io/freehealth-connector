package be.fgov.ehealth.chap4.core.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "SecuredContentType",
   propOrder = {"securedContent"}
)
public class SecuredContentType implements Serializable {
   private static final long serialVersionUID = 1L;
   @XmlElement(
      name = "SecuredContent",
      required = true
   )
   protected byte[] securedContent;

   public SecuredContentType() {
   }

   public byte[] getSecuredContent() {
      return this.securedContent;
   }

   public void setSecuredContent(byte[] value) {
      this.securedContent = value;
   }
}
