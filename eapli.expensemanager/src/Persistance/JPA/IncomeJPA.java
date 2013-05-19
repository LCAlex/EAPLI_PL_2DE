/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance.JPA;

import Model.Expense;
import Model.Income;
import Persistance.IExpenseRepository;
import Persistance.IIncomeRepository;
import java.util.List;

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
        List<Income> IncList = all();
        for (int i = 0; i < IncList.size(); i++) {
            System.out.println("- " + IncList.get(i).getClass().getName());
            System.out.println(IncList.get(i));
        }
        System.out.println("\n");
        //TODO testes unitarios
    }

  
    
}
