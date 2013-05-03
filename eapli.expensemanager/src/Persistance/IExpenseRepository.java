/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;

import Model.Expense;
import Model.ExpenseType;
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
    List<Expense> getAllExpensesWeek(int week, int year);
    List<Expense> getAllExpensesByType(int month, int year, ExpenseType type);
}
