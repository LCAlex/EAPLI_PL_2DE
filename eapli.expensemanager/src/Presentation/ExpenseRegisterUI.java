/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Model.ExpenseType;
import Persistance.ExpenseTypeRepository;
import Controllers.ExpenseRegisterController;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mcn
 */
public class ExpenseRegisterUI {

      public ExpenseRegisterUI() {
      }
      public void run() {
            System.out.println("* * *  REGISTER AN EXPENSE  * * *\n");
            String desc = Console.readLine("Description:");
            Date date = Console.readDate("When (dd-MM-yyyy):");
            double value = Console.readDouble("Amount:");
            
            ExpenseTypeRepository expTypeRep = new ExpenseTypeRepository();
            List<ExpenseType> list = expTypeRep.getAllExpenseTypes();
            displayList(list);
            int nExpType = Console.readInteger("Select Expense Type number:");
            
            ExpenseType expType = list.get(nExpType);
            
            BigDecimal amount = new BigDecimal(value);

            String payment = Console.readLine("Payment Type:");
            
            ExpenseRegisterController controller = new ExpenseRegisterController();
            controller.registerExpense(desc, date, amount, expType, payment);

            System.out.println("expense recorded.");
      }
      
       private void displayList(List<ExpenseType> list) {
            int i=0;
            System.out.println("List of Expenses");
            for (ExpenseType expType : list) {
                  i=i+1;
                  System.out.println("ExpenseType "+i+"\n" + expType);
            }
      }
      
}
