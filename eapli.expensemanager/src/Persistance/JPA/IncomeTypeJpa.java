/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance.JPA;


import Model.IncomeType;
import java.util.List;
import Persistance.IIncomeTypeRepository;

/**
 *
 * @author Tecnica21
 */
public class IncomeTypeJpa extends JpaGeneric<IncomeType, Long> implements IIncomeTypeRepository{
      
    @Override
      public void saveIncomeType(IncomeType iT){
            save(iT);
      }
    
    @Override
     public List<IncomeType> getAllIncomeTypes(){
            return all();
      }
}
