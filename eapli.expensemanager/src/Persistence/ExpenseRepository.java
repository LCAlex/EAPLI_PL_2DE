/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Expense;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tecnica21
 */
public class ExpenseRepository {
    
    private static List<Expense> listExpense = new ArrayList<>();

    public ExpenseRepository() {
        
    }
    
    public void saveExpense(Expense exp){
        if(exp==null){
            throw new IllegalArgumentException();
        }
        listExpense.add(exp);
    }
    
}