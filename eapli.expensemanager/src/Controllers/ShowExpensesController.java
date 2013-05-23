/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Persistance.IExpenseRepository;
import Persistance.IM.ExpenseRepository;
import Persistance.PersistenceFactory;
import java.util.List;

/**
 *
 * @author 
 */
public class ShowExpensesController extends BaseController{
       public ShowExpensesController() {
      }

      public List<Expense> getAllExpenses() {
            IExpenseRepository repo = PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository();
            return repo.getAllExpenses();
      }

      public Expense getLastExpense() {
            IExpenseRepository repo = PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository();
            return repo.getLastExpense();
      }
}
