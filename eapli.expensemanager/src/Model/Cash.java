/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author Ruben Ferreira
 */
public class Cash extends PaymentMean{
    
    private static List<String> listCurrency;

    /**
     * @return the listCurrency
     */
    public static List<String> getListCurrency() {
        return listCurrency;
    }

    /**
     * @param aListCurrency the listCurrency to set
     */
    public static void setListCurrency(List<String> aListCurrency) {
        listCurrency = aListCurrency;
    }
    
    private String currency;
    
   public Cash(int i, String c)
   {
      super(i);  
      currency = c;
   }
    
    @Override
      public String toString(){   
         return super.toString();
      }

    /**
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    
}