package be.ehealth.business.mycarenetdomaincommons.domain;

import java.io.Serializable;
import org.joda.time.DateTime;

public class Routing implements Serializable {
   private static final long serialVersionUID = -8364852115063355399L;
   private CareReceiverId careReceiver;
   private Subject subject;
   private DateTime referenceDate;
   private Period period;

   public Routing() {
   }

   public Routing(CareReceiverId careReceiver, DateTime referenceDate) {
      this.careReceiver = careReceiver;
      this.referenceDate = referenceDate;
   }

   public Routing(CareReceiverId careReceiver, DateTime referenceDate, Period period) {
      this.careReceiver = careReceiver;
      this.referenceDate = referenceDate;
      this.period = period;
   }

   public Routing(Subject subject, DateTime referenceDate) {
      this.subject = subject;
      this.referenceDate = referenceDate;
   }

   public Routing(Subject subject, DateTime referenceDate, Period period) {
      this.subject = subject;
      this.referenceDate = referenceDate;
      this.period = period;
   }

   public CareReceiverId getCareReceiver() {
      return this.careReceiver;
   }

   public void setCareReceiver(CareReceiverId careReceiver) {
      this.careReceiver = careReceiver;
   }

   public Subject getSubject() {
      return this.subject;
   }

   public void setSubject(Subject subject) {
      this.subject = subject;
   }

   public DateTime getReferenceDate() {
      return this.referenceDate;
   }

   public void setReferenceDate(DateTime referenceDate) {
      this.referenceDate = referenceDate;
   }

   public Period getPeriod() {
      return this.period;
   }

   public void setPeriod(Period period) {
      this.period = period;
   }
}
