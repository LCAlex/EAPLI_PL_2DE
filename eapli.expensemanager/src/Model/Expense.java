/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.io.Serializable;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;


/**
 *
 * @author mcn
 */
@Entity
public class Expense implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
      private String description;
      private BigDecimal amount;
    @Temporal(javax.persistence.TemporalType.DATE)
      private Date dateOccurred;
    @ManyToOne
      private ExpenseType expType;
    @OneToOne
     private PaymentMean pm;
    

      

      protected Expense() {
      }


      public Expense(String description, Date dateOccurred, BigDecimal amount, ExpenseType expType, PaymentMean pm) {
            if (description == null || dateOccurred == null || amount == null || expType == null || pm == null) {
                  throw new IllegalArgumentException();
            }
            // cannot record a negative expense or a zero EUR expense
            if (amount.signum() == -1 || amount.signum() == 0) {
                  throw new IllegalArgumentException();
            }
            this.description = description;
            this.dateOccurred = dateOccurred;
            this.amount = amount;
            this.expType = expType;
            this.pm = pm;
      }

      public Expense(String description, int year, int month, int day, BigDecimal amount, ExpenseType expType, PaymentMean pm){
          this(description, DateTime.newDate(year, month, day), amount, expType, pm);
      }
      
      public Expense(Expense exp){
            if(exp==null){
                   throw new IllegalArgumentException();
            }
          this.description=exp.description;
          this.dateOccurred = exp.dateOccurred;
          this.amount=exp.amount;
          this.expType = exp.expType;
          this.pm = exp.pm;
      }
      
      @Override
      public String toString(){
          NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
          double doubleAmount = this.amount.doubleValue();
          String s = "Description:" + this.description +
                     "\nDate:" + this.dateOccurred.toString() +
                     "\nAmount:" + n.format(doubleAmount) +
                     "\nExpenseType:" + this.expType.toString() +
                     "\nPayment:" + this.pm.toString() +
		     "\n";
          return s;
      }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getDateOccurred() {
        return dateOccurred;
    }

    public void setDateOccurred(Date dateOccurred) {
        this.dateOccurred = dateOccurred;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public int getExpenseMonth(){
        Calendar cal = DateTime.dateToCalendar(dateOccurred);
        return cal.MONTH;
    }
    public int getExpenseYear(){
        Calendar cal = DateTime.dateToCalendar(dateOccurred);
        return cal.YEAR;
    }
    
    public int getExpenseWeek(){
        Calendar cal = DateTime.dateToCalendar(dateOccurred);
        return cal.WEEK_OF_YEAR;
    }
    
    public ExpenseType getExpType(){
       return expType;
   }
}

