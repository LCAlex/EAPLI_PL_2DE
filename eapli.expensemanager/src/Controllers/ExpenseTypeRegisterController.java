/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Presentation.ExpenseTypeRegisterUI;
import Model.ExpenseType;
import Persistance.IExpenseTypeRepository;
import Persistance.IM.ExpenseTypeRepository;
import Persistance.PersistenceFactory;
import java.util.List;

/**
 *
 * @author Tecnica21
 */
public class ExpenseTypeRegisterController extends BaseController{
    
    public ExpenseTypeRegisterController() {}
    
    public void obtainList(){
        IExpenseTypeRepository repo = PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseTypeRepository();
        ExpenseTypeRegisterUI interaction = new ExpenseTypeRegisterUI();
        interaction.displayList(repo.getAllExpenseTypes());
    }

    public void registerExpenseType(String name){
        ExpenseType et = new ExpenseType(name);
        IExpenseTypeRepository repo = PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseTypeRepository();
        repo.saveExpenseType(et);
    }
    
}
