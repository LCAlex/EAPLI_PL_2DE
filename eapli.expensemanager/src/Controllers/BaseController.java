/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseRecord;
import Persistance.ExpenseRepository;
import Persistance.IExpenseRepository;
import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author lmsc
 */
public class BaseController {
    
    public BaseController(){
        
    }
    
    public BigDecimal getThisWeekExpenses(){
        List<Expense> list;
        BigDecimal thisWeek;
        IExpenseRepository rep = new ExpenseRepository();
        Calendar cal = DateTime.today();
        list = rep.getAllExpensesWeek(cal.WEEK_OF_YEAR, cal.YEAR);
        ExpenseRecord rec = new ExpenseRecord(list);
        thisWeek=rec.getTotal();
        return thisWeek;
    }
    
    public BigDecimal getThisMonthExpenses(){
        List<Expense> list;
        BigDecimal thisMonth;
        IExpenseRepository rep = new ExpenseRepository();
        Calendar cal = DateTime.today();
        list = rep.getAllExpenses(cal.MONTH, cal.YEAR);
        ExpenseRecord rec = new ExpenseRecord(list);
        thisMonth=rec.getTotal();
        return thisMonth;
    }
}
