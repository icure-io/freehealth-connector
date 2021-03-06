package be.fgov.ehealth.dics.protocol.v4;

import be.ehealth.technicalconnector.adapter.XmlDateAdapter;
import be.fgov.ehealth.dics.core.v4.actual.common.RealActualIngredientKeyType;
import be.fgov.ehealth.dics.core.v4.core.QuantityType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "ConsultRealActualIngredientType",
   propOrder = {"type", "knownEffect", "strengthDescription", "strength", "additionalInformation", "substance", "realActualIngredientEquivalents"}
)
public class ConsultRealActualIngredientType extends RealActualIngredientKeyType implements Serializable {
   private static final long serialVersionUID = 1L;
   @XmlElement(
      name = "Type",
      required = true
   )
   protected String type;
   @XmlElement(
      name = "KnownEffect"
   )
   protected Boolean knownEffect;
   @XmlElement(
      name = "StrengthDescription"
   )
   protected String strengthDescription;
   @XmlElement(
      name = "Strength"
   )
   protected QuantityType strength;
   @XmlElement(
      name = "AdditionalInformation"
   )
   protected String additionalInformation;
   @XmlElement(
      name = "Substance",
      required = true
   )
   protected SubstanceWithStandardsType substance;
   @XmlElement(
      name = "RealActualIngredientEquivalent"
   )
   protected List<ConsultRealActualIngredientEquivalentType> realActualIngredientEquivalents;
   @XmlAttribute(
      name = "StartDate",
      required = true
   )
   @XmlJavaTypeAdapter(XmlDateAdapter.class)
   @XmlSchemaType(
      name = "date"
   )
   protected DateTime startDate;
   @XmlAttribute(
      name = "EndDate"
   )
   @XmlJavaTypeAdapter(XmlDateAdapter.class)
   @XmlSchemaType(
      name = "date"
   )
   protected DateTime endDate;

   public ConsultRealActualIngredientType() {
   }

   public String getType() {
      return this.type;
   }

   public void setType(String value) {
      this.type = value;
   }

   public Boolean isKnownEffect() {
      return this.knownEffect;
   }

   public void setKnownEffect(Boolean value) {
      this.knownEffect = value;
   }

   public String getStrengthDescription() {
      return this.strengthDescription;
   }

   public void setStrengthDescription(String value) {
      this.strengthDescription = value;
   }

   public QuantityType getStrength() {
      return this.strength;
   }

   public void setStrength(QuantityType value) {
      this.strength = value;
   }

   public String getAdditionalInformation() {
      return this.additionalInformation;
   }

   public void setAdditionalInformation(String value) {
      this.additionalInformation = value;
   }

   public SubstanceWithStandardsType getSubstance() {
      return this.substance;
   }

   public void setSubstance(SubstanceWithStandardsType value) {
      this.substance = value;
   }

   public List<ConsultRealActualIngredientEquivalentType> getRealActualIngredientEquivalents() {
      if (this.realActualIngredientEquivalents == null) {
         this.realActualIngredientEquivalents = new ArrayList();
      }

      return this.realActualIngredientEquivalents;
   }

   public DateTime getStartDate() {
      return this.startDate;
   }

   public void setStartDate(DateTime value) {
      this.startDate = value;
   }

   public DateTime getEndDate() {
      return this.endDate;
   }

   public void setEndDate(DateTime value) {
      this.endDate = value;
   }
}
