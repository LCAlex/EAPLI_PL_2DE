/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Ruben Ferreira
 */
@Entity
public class Cash extends PaymentMean implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String currency;
    
    
   // private static List<String> listCurrency;

    

    /**
     * @return the listCurrency
     */
    //public static List<String> getListCurrency() {
      //  return listCurrency;
   // }

    /**
     * @param aListCurrency the listCurrency to set
     */
    //public static void setListCurrency(List<String> aListCurrency) {
      //  listCurrency = aListCurrency;
    //}
    
    
public Cash() {
    }
    
   public Cash(String c)
   {
      super();  
      currency = c;
   }
    
    @Override
      public String toString(){
         String s = "Currency: "+currency;
         return super.toString()+s;
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