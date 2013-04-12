/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;

import Model.Expense;
import java.util.List;

/**
 *
 * @author Tecnica21
 */
public interface IExpenseRepository {
    void saveExpense(Expense exp);
    List<Expense> getAllExpenses();
    Expense getLastExpense();
    List<Expense> getAllExpenses(int month, int year);
}
