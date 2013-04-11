/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;


import Controllers.ShowTotalExpensesController;
import eapli.util.Console;
import java.math.BigDecimal;

/**
 *
 * @author Rui Damiao
 */
public class ShowTotalExpensesUI {
    
    public ShowTotalExpensesUI(){
    }
    
     public void loop() {
            int op;
            BigDecimal total;
            ShowTotalExpensesController controller = new ShowTotalExpensesController();
            op = Console.readInteger("Insert mouth");
            total=controller.showExpenses(op);
            System.out.println("No mes "+op+" teve um gasto de "+total+"€");
     }
}
