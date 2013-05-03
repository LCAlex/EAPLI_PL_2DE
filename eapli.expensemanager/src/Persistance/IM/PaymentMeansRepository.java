/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance.IM;

import Model.PaymentMean;
import Persistance.IPaymentMeansRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ruben Ferreira
 */
public class PaymentMeansRepository implements IPaymentMeansRepository{
    
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
       
       if(listPayMeans.size() == 0)
       {
           System.out.println("LIST IS EMPTY!\n");
       }
       else
       {
           for(int i=0; i < listPayMeans.size();i++)
           { 
               System.out.println("- "+listPayMeans.get(i).getClass().getName());  
               System.out.println(listPayMeans.get(i));                 
           }
           System.out.println("\n");
       }
       
   }
   
   public List<PaymentMean> getListPayMeans(){
       return listPayMeans;
   }
   
     
}
