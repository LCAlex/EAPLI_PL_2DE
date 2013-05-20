/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Income;
import Model.IncomeType;
import Persistance.IM.IncomeRepository;
import Persistance.IM.IncomeTypeRepository;
import java.math.BigDecimal;
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
            IncomeRepository controller=new IncomeRepository();
            controller.saveIncome(inc);
      } 
     
     public List<IncomeType> getAllIncomeTypes(){
         IncomeTypeRepository incTypeRep = new IncomeTypeRepository();
         List<IncomeType> list = incTypeRep.getAllIncomeTypes();
         return list;
     }
     
     public void showIncomeList()
     {
         IncomeRepository rep =new IncomeRepository();
         rep.showIncomeList(); 
     }
     
      public float getSumofIncomes()
     {
         float sum=0;
         IncomeRepository rep =new IncomeRepository();
         sum = rep.getSumofIncomes();
         return sum;
     }
     
     
     
  
}
