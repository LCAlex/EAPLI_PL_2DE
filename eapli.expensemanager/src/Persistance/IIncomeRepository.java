/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;

import Model.Income;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Ruben Ferreira
 */
public interface IIncomeRepository {
    
    void saveIncome(Income inc);
    List<Income> getAllIncomes();
    //void showIncomeList();   
   //Income getLastIncome();
   //List<Income> getAllIncomes(int month, int year);
   //List<Income> getAllIncomesWeek(int week, int year);
   //List<Income> getAllIncomesByType(int month, int year, IncomeType type);
    
}
