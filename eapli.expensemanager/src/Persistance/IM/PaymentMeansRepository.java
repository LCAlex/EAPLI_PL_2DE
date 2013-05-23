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
     
     @Override
   public void registerPaymentMean(PaymentMean pm)
    {
        if (pm==null) {
			throw new IllegalArgumentException();
        }
        listPayMeans.add(pm);      
    }
   
     @Override
   public void showListPayMeans(){
       
       if(listPayMeans.isEmpty())
       {
           System.out.println("LIST IS EMPTY!\n");
       }
       else
       {
           for(int i=0; i < listPayMeans.size();i++)
           { 
               System.out.println("- "+atribuiNome(listPayMeans.get(i)));  
               System.out.println(listPayMeans.get(i));                 
           }
           System.out.println("\n");
       }
       
   }
   
     @Override
   public List<PaymentMean> getListPayMeans(){
       return listPayMeans;
   }
   
   private String atribuiNome(PaymentMean pm){
         String nome = null;
         
         if("Model.Cash".equals(pm.getClass().getName()))
             nome = "Cash";
         if("Model.Check".equals(pm.getClass().getName()))
             nome = "Check";
         if("Model.CreditCard".equals(pm.getClass().getName()))
             nome = "Credit Card";
         if("Model.DebitCard".equals(pm.getClass().getName()))
             nome = "Debit Card";
       
      return nome;
   }
   
     
}
