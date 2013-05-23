/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance.JPA;

import Model.Expense;
import Model.Income;
import Model.IncomeType;
import Persistance.IExpenseRepository;
import Persistance.IIncomeRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Ruben Ferreira
 */
public class IncomeJPA extends JpaGeneric<Income, Long> implements IIncomeRepository {

    @Override
    public void saveIncome(Income inc) {
        save(inc);
    }

    @Override
    public List<Income> getAllIncomes() {
        return all();
    }
    
    @Override
    public void showIncomeList() {
        EntityManager em = getEntityManager();
        Query q = em.createQuery("SELECT * FROM Income");
        System.out.println(q.getResultList());
    }

    @Override
    public float getSumofIncomes() {
        float sum=0;
        
        return sum;
    }

    @Override
    public Income getLastIncome() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Income> getAllIncomes(int month, int year) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Income> getAllIncomesWeek(int week, int year) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Income> getAllIncomesByType(int month, int year, IncomeType type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

  
    
}
