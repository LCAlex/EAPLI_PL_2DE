/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseTypeRegisterController;
import eapli.util.Console;
import java.util.ArrayList;

/**
 *
 * @author Barrakeiro
 */
public class ExpenseTypeRegisterUI {
    
    public ExpenseTypeRegisterUI() {
      }

public void run() {
            System.out.println("* * *  REGISTER AN EXPENSE TYPE  * * *\n");
            String name = Console.readLine("Name:");
            ExpenseTypeRegisterController controller = new ExpenseTypeRegisterController();
            controller.registerExpense(name);

            System.out.println("expense type recorded.");
      }

    public void displayList(ArrayList <ExpenseType> expenseTypeList) {
//        for(int i = 0; i < expenseTypeList.size(); i++)
//        {
            ExpenseType expenseType = expenseTypeList.;  
            for(ExpenseType d:expenseTypeList) {
                System.out.println(d);
            }
    }
     //} 
}
