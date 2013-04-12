/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Eapli;

import Model.Expense;
import Model.ExpenseType;
import Persistance.ExpenseRepository;
import Persistance.IExpenseRepository;
import java.math.BigDecimal;

/**
 *
 * @author Tecnica21
 */
public class ExpensesBootstrapper {
    static{
        IExpenseRepository repo = new ExpenseRepository();
        
        repo.saveExpense(new Expense("Autocarro", 2013, 3, 4, new BigDecimal(2.4),new ExpenseType("Transporte"), " "));
        repo.saveExpense(new Expense("Almoço", 2013, 3, 5, new BigDecimal(12.4),new ExpenseType("Refeiçoes"), " "));
        repo.saveExpense(new Expense("Sapatilhas", 2013, 3, 4, new BigDecimal(123.4),new ExpenseType("Vestuario"), " "));
        repo.saveExpense(new Expense("Cinema", 2013, 3, 4, new BigDecimal(5),new ExpenseType("Lazer"), " "));
    }
}
