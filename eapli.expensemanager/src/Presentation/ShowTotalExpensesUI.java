/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;


import Controllers.ShowTotalExpensesController;
import eapli.util.Console;

/**
 *
 * @author Rui Damiao
 */
public class ShowTotalExpensesUI {
    
    public ShowTotalExpensesUI(){
    }
    
     public void loop() {
            int op;
            ShowTotalExpensesController controller = new ShowTotalExpensesController();
            op = Console.readInteger("Insert mouth");
            controller.showExpenses(op);
     }
}
