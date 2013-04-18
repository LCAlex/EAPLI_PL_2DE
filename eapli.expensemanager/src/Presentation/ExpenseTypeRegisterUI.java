/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.ExpenseTypeRegisterController;
import Model.ExpenseType;
import eapli.util.Console;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Barrakeiro
 */
public class ExpenseTypeRegisterUI extends BaseUI{
    ExpenseTypeRegisterController controller = new ExpenseTypeRegisterController();
    
    @Override
    public void header(){
        System.out.println("* * *  REGISTER AN EXPENSE TYPE  * * *\n");
    }
    
    @Override
    public BaseController controller(){
        return controller;
    }
    
    public ExpenseTypeRegisterUI() {}

    @Override
    public void run() {
        String name;
        do{
            controller.obtainList();
            name = Console.readLine("\n\nInsert the Expense Type Name: ");
            if(name.equalsIgnoreCase("end")){
                // Do nothing
            }else{
                controller.registerExpenseType(name);
            }
        }while(!name.equalsIgnoreCase("end"));
     }

    public void displayList(List <ExpenseType> expenseTypeList) {
        for(ExpenseType d:expenseTypeList) {
            System.out.println(d);
        }
    }
}
