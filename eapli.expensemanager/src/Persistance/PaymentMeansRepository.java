/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;

import Model.PaymentMean;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ruben Ferreira
 */
public class PaymentMeansRepository {
    
     private static List<PaymentMean> listPayMeans = new ArrayList<>();

    public PaymentMeansRepository() {
    }
     
   public void registerPaymentMean(PaymentMean pm)
    {
        if (pm==null) {
			throw new IllegalArgumentException();
        }
        listPayMeans.add(pm);      
    }
   
   public void showListPayMeans(){
       
       for(int i=0; i < listPayMeans.size();i++){
           System.out.println("- "+listPayMeans.get(i)+"\n");
       }
      System.out.println("\n");
   }
     
}
