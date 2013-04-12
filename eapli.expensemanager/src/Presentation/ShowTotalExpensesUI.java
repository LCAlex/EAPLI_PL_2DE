/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;


import Controllers.ShowTotalExpensesController;
import eapli.util.Console;
import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Calendar;

/**
 *
 * @author Rui Damiao
 */
public class ShowTotalExpensesUI {
    
    public ShowTotalExpensesUI(){
    }
    
     public void loop() {
            int month,year;
            BigDecimal total;
            ShowTotalExpensesController controller = new ShowTotalExpensesController();
            month = Console.readInteger("Insert month");
            year = Console.readInteger("Insert year");
            total=controller.showExpenses(month,year);
            System.out.println("No mes "+month+" teve um gasto de "+total+"€ no ano"+year);
     }
}
