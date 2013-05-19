/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.IncomeController;

/**
 *
 * @author Ruben Ferreira
 */
public class ShowIncomesUI extends BaseUI{

    IncomeController ic = new IncomeController();
    
    public ShowIncomesUI() {
    }

    @Override
    public void header() {
        System.out.println("* * *  SHOW INCOME LIST  * * *\n");
    }

    @Override
    public void run() {
         ic.showIncomeList();
    }
    
     @Override
    protected BaseController controller() {
        return ic; 
    }
    
}
