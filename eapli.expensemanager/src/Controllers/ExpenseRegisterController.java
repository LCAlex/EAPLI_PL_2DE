/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import Model.*;
import Persistance.IExpenseRepository;
import Persistance.IExpenseTypeRepository;
import Persistance.IM.ExpenseRepository;
import Persistance.IM.ExpenseTypeRepository;
import Persistance.IM.PaymentMeansRepository;
import Persistance.IPaymentMeansRepository;
import Persistance.PersistenceFactory;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mcn
 */
public class ExpenseRegisterController extends BaseController{

      public ExpenseRegisterController() {
      }

     public void registerExpense(String desc, Date date, BigDecimal amount, ExpenseType expType, PaymentMean pm) {
            Expense expense = new Expense(desc, date, amount, expType, pm);
            IExpenseRepository controller= PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository();
            controller.saveExpense(expense);
      } 
     
     public List<ExpenseType> getAllExpenseTypes(){
         IExpenseTypeRepository expTypeRep = PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseTypeRepository();
         List<ExpenseType> list = expTypeRep.getAllExpenseTypes();
         return list;
     }
     
     public List<PaymentMean> getAllPaymentMeans(){
         IPaymentMeansRepository expPayMean = PersistenceFactory.getInstance().buildRepositoryFactory().getPaymentMeanRepository();
         List<PaymentMean> list = expPayMean.getListPayMeans();
         return list;
     }
      
}
