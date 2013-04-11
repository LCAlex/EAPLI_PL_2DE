/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


/**
 *
 * @author mcn
 */
public class Expense {
      private String description;
      private BigDecimal amount;
      private Date dateOccurred;
      private ExpenseType expType;
      private String payment;
      

      protected Expense() {
      }

      public Expense(String description, Date dateOccurred, BigDecimal amount, ExpenseType expType, String payment) {
            if (description == null || dateOccurred == null || amount == null || expType == null || payment == null) {
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
            this.payment = payment;
      }

      public Expense(String description, int year, int month, int day, BigDecimal amount, ExpenseType expType, String payment){
          this(description, DateTime.newDate(year, month, day), amount, expType, payment);
      }
      
      public Expense(Expense exp){
            if(exp==null){
                   throw new IllegalArgumentException();
            }
          this.description=exp.description;
          this.dateOccurred = dateOccurred;
          this.amount=exp.amount;
          this.expType = exp.expType;
          this.payment = exp.payment;
      }
      
      @Override
      public String toString(){
          NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
          double doubleAmount = this.amount.doubleValue();
          String s = "Description:" + this.description +
                     "\nDate:" + this.dateOccurred.toString() +
                     "\nAmount:" + n.format(doubleAmount) +
                     "\nExpenseType:" + this.expType.toString() +
                     "\nPayment:" + this.payment;
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
      
}
