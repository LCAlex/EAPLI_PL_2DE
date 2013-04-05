/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseTypeRegisterController;
import Model.ExpenseType;
import eapli.util.Console;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Barrakeiro
 */
public class ExpenseTypeRegisterUI {
    
    public ExpenseTypeRegisterUI() {}

public void run() {
    
            ExpenseTypeRegisterController controller = new ExpenseTypeRegisterController();
            
            String name;
            do{
                System.out.println("* * *  REGISTER AN EXPENSE TYPE  * * *\n");
                controller.obtainList();
                name = Console.readLine("Name: ");
                if(name.equalsIgnoreCase("end")){
                    // Do nothing
                }else{
                    controller.registerExpenseType(name);
                }
            }while(name.equalsIgnoreCase("end"));
      }

    public void displayList(List <ExpenseType> expenseTypeList) {
            for(ExpenseType d:expenseTypeList) {
                System.out.println(d);
            }
    }
}
