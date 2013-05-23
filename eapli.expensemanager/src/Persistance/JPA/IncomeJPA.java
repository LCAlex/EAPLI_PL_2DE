/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance.JPA;

import Model.Income;
import Persistance.IIncomeRepository;
import java.math.BigDecimal;
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

  
    
}
