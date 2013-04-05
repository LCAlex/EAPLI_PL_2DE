/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.text.NumberFormat;
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
      

      protected Expense() {
      }

      public Expense(String description, Date dateOccurred, BigDecimal amount) {
            if (description == null || dateOccurred == null || amount == null) {
                  throw new IllegalArgumentException();
            }
            // cannot record a negative expense or a zero EUR expense
            if (amount.signum() == -1 || amount.signum() == 0) {
                  throw new IllegalArgumentException();
            }
            this.description = description;
            this.amount = amount;
      }

      public Expense(String description, int year, int month, int day, BigDecimal amount){
          this(description, DateTime.newDate(year, month, day), amount);
      }
      
      public Expense(Expense exp){
            if(exp==null){
                   throw new IllegalArgumentException();
            }
          this.description=exp.description;
          this.amount=exp.amount;
      }
      
      @Override
      public String toString(){
          NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
          double doubleAmount = this.amount.doubleValue();
          String s = "Description:" + this.description +
                     "\nAmount:" + n.format(doubleAmount);
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
      
}
