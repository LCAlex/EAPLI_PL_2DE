/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance.JPA;


import Model.ExpenseType;
import java.util.List;
import Persistance.IExpenseTypeRepository;

/**
 *
 * @author Rui Damiao
 */
public class ExpenseTypeJpa extends JpaGeneric<ExpenseType, Integer> implements IExpenseTypeRepository{
      
    @Override
      public void saveExpenseType(ExpenseType eT){
            save(eT);
      }
    
    @Override
     public List<ExpenseType> getAllExpenseTypes(){
            return all();
      }
}
