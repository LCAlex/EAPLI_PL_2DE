/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Cash;
import Model.Check;
import Model.CreditCard;
import Model.DebitCard;
import Model.Expense;
import Model.PaymentMean;
import Persistance.ExpenseRepository;
import Persistance.PaymentMeansRepository;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Ruben Ferreira
 */
public class PaymentMeansController {
    
    PaymentMeansRepository pmr = new PaymentMeansRepository();

    public PaymentMeansController(){
        
    }
    
    void registerCash() {
        Cash c = new Cash();
        pmr.registerPaymentMean(c);
     } 
    
    void registerCheck(int num, String desc){
        Check c = new Check(num, desc);
        pmr.registerPaymentMean(c);
    }
    
    void registerCCard(Date dv,long num, String ib, String tipo){
        CreditCard cc = new CreditCard(dv, num, ib, tipo);
        pmr.registerPaymentMean(cc);
    }
    
    void registerDCard(long num, String ib, String tipo){
        DebitCard dc = new DebitCard(num, ib, tipo);  
        pmr.registerPaymentMean(dc);
    }
    
    
}
