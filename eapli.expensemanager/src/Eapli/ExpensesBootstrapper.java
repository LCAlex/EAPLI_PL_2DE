/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Eapli;

import Model.Expense;
import Model.ExpenseType;
import Persistance.ExpenseTypeRepository;
import Persistance.ExpenseRepository;
import Persistance.IExpenseRepository;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Tecnica21
 */
public class ExpensesBootstrapper {
    static{
        IExpenseRepository repo = new ExpenseRepository();
        
        ExpenseTypeRepository expTypeRep = new ExpenseTypeRepository();
        List<ExpenseType> list = expTypeRep.getAllExpenseTypes();
        
        repo.saveExpense(new Expense("Autocarro", 2013, 3, 4, new BigDecimal(2.4),list.get(0),"cash"));
        repo.saveExpense(new Expense("Almoço", 2013, 3, 5, new BigDecimal(12.4),list.get(1),"cash"));
        repo.saveExpense(new Expense("Sapatilhas", 2013, 3, 4, new BigDecimal(123.4),list.get(2),"cash"));
        repo.saveExpense(new Expense("Cinema", 2013, 3, 4, new BigDecimal(5),list.get(3),"cash"));
    }
}
