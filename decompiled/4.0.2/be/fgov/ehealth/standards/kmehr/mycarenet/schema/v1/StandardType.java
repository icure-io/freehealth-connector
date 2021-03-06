package be.fgov.ehealth.standards.kmehr.mycarenet.schema.v1;

import be.fgov.ehealth.standards.kmehr.mycarenet.cd.v1.CDSTANDARD;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "standardType",
   propOrder = {"cd", "specialisation"}
)
public class StandardType implements Serializable {
   private static final long serialVersionUID = 1L;
   @XmlElement(
      required = true
   )
   protected CDSTANDARD cd;
   protected Specialisation specialisation;

   public StandardType() {
   }

   public CDSTANDARD getCd() {
      return this.cd;
   }

   public void setCd(CDSTANDARD value) {
      this.cd = value;
   }

   public Specialisation getSpecialisation() {
      return this.specialisation;
   }

   public void setSpecialisation(Specialisation value) {
      this.specialisation = value;
   }
}
