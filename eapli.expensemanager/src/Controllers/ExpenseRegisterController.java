/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import Model.*;
import Persistance.ExpenseRepository;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author mcn
 */
public class ExpenseRegisterController {

      public ExpenseRegisterController() {
      }
     public void registerExpense(String desc, Date date, BigDecimal amount, ExpenseType expType, String payment) {
            Expense expense = new Expense(desc, date, amount, expType, payment);
            ExpenseRepository controller=new ExpenseRepository();
            controller.saveExpense(expense);
      } 
      
}
