/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Presentation.IncomeTypeRegisterUI;
import Model.IncomeType;
import Persistance.IIncomeTypeRepository;
import Persistance.IM.IncomeTypeRepository;
import Persistance.PersistenceFactory;
import java.util.List;

/**
 *
 * @author Tecnica21
 */
public class IncomeTypeRegisterController extends BaseController{
    
    public IncomeTypeRegisterController() {}
    
    public void obtainList(){
        IIncomeTypeRepository repo = PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeTypeRepository();
        IncomeTypeRegisterUI interaction = new IncomeTypeRegisterUI();
        interaction.displayList(repo.getAllIncomeTypes());
    }

    public void registerIncomeType(String name){
        IncomeType it = new IncomeType(name);
        IIncomeTypeRepository repo = PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeTypeRepository();
        repo.saveIncomeType(it);
    }
    
}
