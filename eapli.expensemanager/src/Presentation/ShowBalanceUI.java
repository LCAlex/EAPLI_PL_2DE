/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;


import Controllers.BaseController;
import Controllers.ShowBalanceController;
import java.math.BigDecimal;

/**
 *
 * @author Luis Magalhaes 
 */
public class ShowBalanceUI extends BaseUI{
    private BaseController basecontroller=new BaseController();
    
    public ShowBalanceUI(){
    }
    
  
    @Override
    protected BaseController controller() {
        return basecontroller;
    }

    @Override
    public void header() {
        System.out.println("|*** SHOW BALANCE ***|");    
    }
    
    @Override
    public void run() {
           
            BigDecimal balance;
            ShowBalanceController controller = new ShowBalanceController();
            
            //balance=controller.ShowBalanceController();
           // System.out.println("Your Balance is: "+balance+"€");
     }

}
