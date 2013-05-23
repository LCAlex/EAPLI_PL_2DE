/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Income;
import Model.IncomeType;
import Persistance.IIncomeRepository;
import Persistance.IIncomeTypeRepository;
import Persistance.IM.IncomeRepository;
import Persistance.IM.IncomeTypeRepository;
import Persistance.PersistenceFactory;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ruben Ferreira
 */
public class IncomeController extends BaseController {
    
     public IncomeController() {
      }

     public void registerIncome(String desc, Date date, BigDecimal amount, IncomeType incType) {
            Income inc = new Income(desc, date, amount, incType);
            IIncomeRepository controller= PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeRepository();
            controller.saveIncome(inc);
      } 
     
     public List<IncomeType> getAllIncomeTypes(){
         IIncomeTypeRepository incTypeRep = PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeTypeRepository();
         List<IncomeType> list = incTypeRep.getAllIncomeTypes();
         return list;
     }
     
     public List<Income>  getIncomeList()
     {
         List<Income> listIncome = new ArrayList<>();
         IIncomeRepository rep = PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeRepository();
         listIncome = rep.getAllIncomes(); 
         return listIncome;
     }
  
     
     
     
  
}
