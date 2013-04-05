/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;
import Model.ExpenseType;
import java.util.List;
/**
 *
 * @author Barrakeiro
 */
public interface IExpenseTypeRepository {
   
    void saveExpenseType(ExpenseType et);
    List<ExpenseType> getAllExpenseTypes();
    
}
