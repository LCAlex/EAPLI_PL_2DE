/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Presentation.IncomeTypeRegisterUI;
import Model.IncomeType;
import Persistance.IM.IncomeTypeRepository;
import java.util.List;

/**
 *
 * @author Tecnica21
 */
public class IncomeTypeRegisterController extends BaseController{
    
    public IncomeTypeRegisterController() {}
    
    public void obtainList(){
        IncomeTypeRepository repo = new IncomeTypeRepository();
        IncomeTypeRegisterUI interaction = new IncomeTypeRegisterUI();
        interaction.displayList(repo.getAllIncomeTypes());
    }

    public void registerIncomeType(String name){
        IncomeType it = new IncomeType(name);
        IncomeTypeRepository repo = new IncomeTypeRepository();
        repo.saveIncomeType(it);
    }
    
}
