/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controllers.IncomeController;
import Controllers.ShowExpensesController;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Luis Magalhaes
 */
public class AccountServices {
    
    List <Expense> listExp;
    List <Income> listInc;
    
    ShowExpensesController c1 = new ShowExpensesController();
    IncomeController i1 = new IncomeController();
    
    
       public BigDecimal getBalance(){
           
           BigDecimal totalExp = null;
           BigDecimal totalInc = null;
           BigDecimal total=null;
           
           listExp=c1.getAllExpenses();
           
           for (int i = 0; i < listExp.size(); i++) {
               totalExp=totalExp.add(listExp.get(i).getAmount());
           }
           
           for (int i = 0; i < listInc.size(); i++) {
               totalInc=totalInc.add(listInc.get(i).getAmount());
           }
           total=totalInc.subtract(totalExp);
           return total;
       }
}
