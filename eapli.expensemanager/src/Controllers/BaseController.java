/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseRecord;
import Persistance.IM.ExpenseRepository;
import Persistance.IExpenseRepository;
import Persistance.PersistenceFactory;
import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.Persistence;

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
        IExpenseRepository rep = PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository();
        //Calendar cal = DateTime.today();
        list = rep.getAllExpensesWeek(DateTime.currentWeekNumber(),DateTime.currentYear());
        
        ExpenseRecord rec = new ExpenseRecord(list);
        thisWeek=rec.getTotal();
        return thisWeek;
    }
    
    public BigDecimal getThisMonthExpenses(){
        List<Expense> list;
        BigDecimal thisMonth;
        IExpenseRepository rep = PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository();
        //Calendar cal = DateTime.today();
        list = rep.getAllExpenses(DateTime.currentMonth(), DateTime.currentYear());
        ExpenseRecord rec = new ExpenseRecord(list);
        thisMonth=rec.getTotal();
        return thisMonth;
    }
}
