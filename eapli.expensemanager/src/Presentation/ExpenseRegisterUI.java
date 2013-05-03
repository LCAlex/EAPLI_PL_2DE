/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controller.ExpenseRegisterController;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Tecnica21
 */
public class ExpenseRegisterUI {

    public ExpenseRegisterUI() {
        
    }
    
    public void run(){
        System.out.println("* * * REGISTER AN EXPENSE * * *\n");
        String desc = Console.readLine("Description: ");
        Date date = Console.readDate("When (dd-mm-yyy): ");
        double value = Console.readDouble("Amount: ");
        BigDecimal amount = new BigDecimal(value);
        
        ExpenseRegisterController controller = new ExpenseRegisterController();
        controller.registerExpense(desc, date, amount);
        
        System.out.println("Expense Recorded.\n");
    }
}
