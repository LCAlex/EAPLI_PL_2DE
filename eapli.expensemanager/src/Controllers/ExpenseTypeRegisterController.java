/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Presentation.ExpenseTypeRegisterUI;
import Model.ExpenseType;
import Persistance.ExpenseTypeRepository;
import java.util.List;

/**
 *
 * @author Tecnica21
 */
public class ExpenseTypeRegisterController extends BaseController{
    
    public ExpenseTypeRegisterController() {}
    
    public void obtainList(){
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
        ExpenseTypeRegisterUI interaction = new ExpenseTypeRegisterUI();
        interaction.displayList(repo.getAllExpenseTypes());
    }

    public void registerExpenseType(String name){
        ExpenseType et = new ExpenseType(name);
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
        repo.saveExpenseType(et);
    }
    
}
