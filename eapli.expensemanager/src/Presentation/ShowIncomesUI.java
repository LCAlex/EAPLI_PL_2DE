/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.IncomeController;
import Model.Income;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ruben Ferreira
 */
public class ShowIncomesUI extends BaseUI{

    IncomeController ic = new IncomeController();
    List<Income> listIncome = new ArrayList<>();
    
    public ShowIncomesUI() {
    }

    @Override
    public void header() {
        System.out.println("* * *  SHOW INCOME LIST  * * *\n");
    }

    @Override
    public void run() {
        
         listIncome = ic.getIncomeList();
         
         if(listIncome.isEmpty())
       {
           System.out.println("LIST IS EMPTY!\n");
       }
       else
       {
           for(int i=0; i < listIncome.size();i++)
           { 
               System.out.println("- "+listIncome.get(i));                 
           }
           System.out.println("\n");
       }
    }
    
     @Override
    protected BaseController controller() {
        return ic; 
    }
    
}
