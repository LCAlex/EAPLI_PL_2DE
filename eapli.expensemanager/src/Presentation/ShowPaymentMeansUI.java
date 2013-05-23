/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.PaymentMeansController;
import Model.PaymentMean;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ruben Ferreira
 */
public class ShowPaymentMeansUI extends BaseUI {

    PaymentMeansController pmc = new PaymentMeansController();
    List<PaymentMean> listpm = new ArrayList<>();
    
    ShowPaymentMeansUI()
    {
    }

    @Override
    public void header() {
        System.out.println("* * *  LIST OF PAYMENT MEANS  * * *");
    }

    @Override
    public void run() {
        listpm = pmc.getListPaymentMeans();
        if( listpm.isEmpty())
       {
           System.out.println("LIST IS EMPTY!\n");
       }
       else
       {
           for(int i=0; i <  listpm.size();i++)
           { 
               System.out.println("- "+atribuiNome( listpm.get(i)));  
               System.out.println( listpm.get(i));                 
           }
           System.out.println("\n");
       }
    }
    
     private String atribuiNome(PaymentMean pm){
         String nome = null;
         
         if("Model.Cash".equals(pm.getClass().getName()))
             nome = "Cash";
         if("Model.Cheque".equals(pm.getClass().getName()))
             nome = "Check";
         if("Model.CreditCard".equals(pm.getClass().getName()))
             nome = "Credit Card";
         if("Model.DebitCard".equals(pm.getClass().getName()))
             nome = "Debit Card";
       
      return nome;
   }

    @Override
    protected BaseController controller() {
        return pmc;
    }
}
