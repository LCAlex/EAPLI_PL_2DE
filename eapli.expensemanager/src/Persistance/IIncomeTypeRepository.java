/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;
import Model.IncomeType;
import java.util.List;
/**
 *
 * @author Barrakeiro
 */
public interface IIncomeTypeRepository {
   
    void saveIncomeType(IncomeType it);
    List<IncomeType> getAllIncomeTypes();
    
}