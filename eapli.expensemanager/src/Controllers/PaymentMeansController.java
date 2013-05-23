/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Cash;
import Model.Cheque;
import Model.CreditCard;
import Model.DebitCard;
import Model.PaymentMean;
import Persistance.IM.PaymentMeansRepository;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ruben Ferreira
 */

public class PaymentMeansController extends BaseController {
    
    PaymentMeansRepository pmr = new PaymentMeansRepository();

    public PaymentMeansController(){
        
    }
    
     public void registerCash(String curr) {
        Cash c = new Cash(curr);
        pmr.registerPaymentMean(c);
     } 
    
     public void registerCheck(int num, String desc){
        Cheque c = new Cheque(num, desc);
        pmr.registerPaymentMean(c);
    }
    
     public void registerCCard(Date dv,int num, String ib, String tipo){
        CreditCard cc = new CreditCard(dv, num, ib, tipo);
        pmr.registerPaymentMean(cc);
    }
    
     public void registerDCard(int num, String ib, String tipo){
        DebitCard dc = new DebitCard(num, ib, tipo);  
        pmr.registerPaymentMean(dc);
    }
    
    public List<PaymentMean> getListPaymentMeans(){
        return pmr.getListPayMeans();
    }
    
   
    
}
