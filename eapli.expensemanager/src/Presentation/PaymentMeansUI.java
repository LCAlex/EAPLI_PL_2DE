/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.PaymentMeansController;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Ruben Ferreira
 */
public class PaymentMeansUI {
    
    public PaymentMeansUI() {
      
    }
    
      public void run() {
          
          PaymentMeansController pmc = new PaymentMeansController();
          
            System.out.println("* * *  REGISTER A PAYMENT MEAN  * * *\n");
            
            System.out.println("* * *  TYPES  * * *\n");
            System.out.println("* * *  LIST OF PAYMENT MEANS  * * *\n");
            
            
            
          /*  String desc = Console.readLine("Description:");
            Date date = Console.readDate("When (dd-MM-yyyy):");
            double value = Console.readDouble("Amount:");
            BigDecimal amount = new BigDecimal(value);*/

            
            

            System.out.println("Payment mean recorded.\n");
      }
    
}
