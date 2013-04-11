/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseRecord;
import Persistance.ExpenseRepository;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author lmsc
 */
public class ShowTotalExpensesController {
    List<Expense> list;
    
    
    public ShowTotalExpensesController(){
    }
    
    public BigDecimal showExpenses(int month){
        ExpenseRepository rep = new ExpenseRepository();
        list=rep.getAllExpenses(month);
        ExpenseRecord rec = new ExpenseRecord(list);
        return rec.getTotal();
    }
    
    
}
