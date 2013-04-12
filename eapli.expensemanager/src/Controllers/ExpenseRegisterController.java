/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import Model.*;
import Persistance.ExpenseRepository;
import Persistance.ExpenseTypeRepository;
import Persistance.PaymentMeansRepository;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mcn
 */
public class ExpenseRegisterController {

      public ExpenseRegisterController() {
      }
     public void registerExpense(String desc, Date date, BigDecimal amount, ExpenseType expType, PaymentMean pm) {
            Expense expense = new Expense(desc, date, amount, expType, pm);
            ExpenseRepository controller=new ExpenseRepository();
            controller.saveExpense(expense);
      } 
     
     public List<ExpenseType> getAllExpenseTypes(){
         ExpenseTypeRepository expTypeRep = new ExpenseTypeRepository();
         List<ExpenseType> list = expTypeRep.getAllExpenseTypes();
         return list;
     }
     
     public List<PaymentMean> getAllPaymentMeans(){
         PaymentMeansRepository expPayMean = new PaymentMeansRepository();
         List<PaymentMean> list = expPayMean.getListPayMeans();
         return list;
     }
      
}
