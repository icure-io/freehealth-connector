package be.fgov.ehealth.dics.core.v4.actual.common;

import be.fgov.ehealth.dics.protocol.v4.ConsultDerogationImportType;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "DerogationImportKeyType"
)
@XmlSeeAlso({ConsultDerogationImportType.class})
public class DerogationImportKeyType implements Serializable {
   private static final long serialVersionUID = 1L;
   @XmlAttribute(
      name = "SequenceNr",
      required = true
   )
   protected short sequenceNr;

   public DerogationImportKeyType() {
   }

   public short getSequenceNr() {
      return this.sequenceNr;
   }

   public void setSequenceNr(short value) {
      this.sequenceNr = value;
   }
}
