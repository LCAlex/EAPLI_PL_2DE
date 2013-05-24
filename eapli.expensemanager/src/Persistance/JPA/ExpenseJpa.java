/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance.JPA;

import Model.Expense;
import Model.ExpenseType;
import java.util.List;
import Persistance.IExpenseRepository;
import eapli.util.DateTime;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.Query;
/**
 *
 * @author Rui Damiao
 */
public class ExpenseJpa extends JpaGeneric<Expense, Long> implements IExpenseRepository {
      
    @Override
      public void saveExpense(Expense exp){
            save(exp);
      }
    
    @Override
      public List<Expense> getAllExpenses(){
            return all();
      }
    
    @Override
    public Expense getLastExpense() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Expense> getAllExpenses(int month, int year) {
        EntityManager em = getEntityManager();
        Query q = em.createQuery("SELECT exp FROM Expense exp WHERE exp.dateOccurred >= :start AND exp.dateOccurred <= :end");
        Calendar start = DateTime.newCalendarDate(year, month, 1);
        Calendar end = DateTime.newCalendarDate(year, month, 31);
        q.setParameter("start", start.getTime());
        q.setParameter("end", end.getTime());
        return q.getResultList();
    }

    @Override
    public List<Expense> getAllExpensesWeek(int week, int year) {
        EntityManager em = getEntityManager();
        Query q = em.createQuery("SELECT exp FROM Expense exp WHERE exp.dateOccurred >= :start AND exp.dateOccurred <= :end");
        Calendar start = DateTime.firstDateOfWeek(year, week);
        Calendar end = DateTime.lastDateOfWeek(year, week);
        q.setParameter("start", start.getTime());
        q.setParameter("end", end.getTime());
        return q.getResultList();
    }

    @Override
    public List<Expense> getAllExpensesByType(int month, int year, ExpenseType type) {
        EntityManager em = getEntityManager();
        Query q = em.createQuery("SELECT exp FROM Expense exp WHERE exp.dateOccurred >= :start AND exp.dateOccurred <= :end ORDER BY exp.expType.id");
        Date start = DateTime.newDate(year, month, 1);
        Date end = DateTime.newDate(year, month, 31);
        q.setParameter("start", start);
        q.setParameter("end", end);
        return q.getResultList();   
    }
}