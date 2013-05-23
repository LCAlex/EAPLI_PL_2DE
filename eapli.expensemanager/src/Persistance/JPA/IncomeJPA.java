/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance.JPA;

import Model.Income;
import Persistance.IIncomeRepository;
import java.util.List;

/**
 *
 * @author Ruben Ferreira
 */
public class IncomeJPA extends JpaGeneric<Income, Integer> implements IIncomeRepository {

    @Override
    public void saveIncome(Income inc) {
        save(inc);
    }

    @Override
    public List<Income> getAllIncomes() {
        return all();
    }

   /* @Override
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
    }*/

  
    
}
