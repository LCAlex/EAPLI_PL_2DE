/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controllers.ShowExpensesController;
import java.util.List;

/**
 *
 * @author Luis Magalhaes
 */
public class AccountServices {
    
    List <Expense> listExp;
    //List <Income> listInc;
    
    ShowExpensesController c1 = new ShowExpensesController();
    //ShowIncomesController i1 = new ShowIncomesController();
    
    
//       public BigDecimal getBalance(){
//           
//           BigDecimal totalExp = null;
//           BigDecimal totalInc = null;
//           
//           listExp=c1.getAllExpenses();
//           
//           for (int i = 0; i < listExp.size(); i++) {
//               totalExp=totalExp.add(listExp.get(i).getAmount());
//           }
//           
//           for (int i = 0; i < listInc.size(); i++) {
//               totalInc=totalInc.add(listInc.get(i).getAmount());
//           }
//           
//           return ;
//       }
}
