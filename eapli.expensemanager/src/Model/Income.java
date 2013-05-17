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
 * @author Tecnica21
 */
public class Income {

    private String description;
    private BigDecimal amount;
    private Date dateOccurred;
    private IncomeType incType;

    protected Income() {
    }

    public Income(String description, Date dateOccurred, BigDecimal amount, IncomeType incType) {
        if (description == null || dateOccurred == null || amount == null || incType == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() == 0) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.dateOccurred = dateOccurred;
        this.amount = amount;
        this.incType = incType;
    }

    public Income(String description, int year, int month, int day, BigDecimal amount, IncomeType incType) {
            if (description == null || dateOccurred == null || amount == null || incType == null) {
                  throw new IllegalArgumentException();
            }
            // cannot record a negative income or a zero EUR income
            if (amount.signum() == -1 || amount.signum() == 0) {
                  throw new IllegalArgumentException();
            }
            this.description = description;
            this.dateOccurred = dateOccurred;
            this.amount = amount;
            this.incType = incType;
      }
    
   /* public Income(String description, int year, int month, int day, BigDecimal amount, IncomeType incType){
        this(description, DateTime.newDate(year, month, day), amount, incType);
    }*/

    public Income(Income inc) {
        if (inc == null) {
            throw new IllegalArgumentException();
        }
        this.description = inc.description;
        this.dateOccurred = inc.dateOccurred;
        this.amount = inc.amount;
        this.incType = inc.incType;
    }

    @Override
    public String toString() {
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        double doubleAmount = this.amount.doubleValue();
        String s = "Description:" + this.description
                + "\nDate:" + this.dateOccurred.toString()
                + "\nAmount:" + n.format(doubleAmount)
                + "\nIncomeType:" + this.incType.toString()
                + "\n";
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

    public IncomeType getExpType() {
        return incType;
    }

    public int getIncomeYear() {
        Calendar cal = DateTime.dateToCalendar(dateOccurred);
        return cal.YEAR;
    }

    public int getIncomeMonth() {
        Calendar cal = DateTime.dateToCalendar(dateOccurred);
        return cal.MONTH;
    }

    public int getIncomeWeek() {
        Calendar cal = DateTime.dateToCalendar(dateOccurred);
        return cal.WEEK_OF_YEAR;
    }
}
