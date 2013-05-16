/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.ShowTotalExpensesController;
import ModelView.ExpensesperMonthDTO;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mcatia
 */
public class ShowTotalExpensesByTypeUI extends BaseUI{
    private BaseController basecontroller=new BaseController();
    
    public ShowTotalExpensesByTypeUI(){
         
    }
    
    @Override
    protected BaseController controller() {
        return basecontroller;
    }

    @Override
    public void header() {
        System.out.println("|*** SHOW TOTAL EXPENSES BY TYPE PER MONTH ***|");
    }

    @Override
    public void run() {
        int month,year;
        BigDecimal total;
        ShowTotalExpensesController controller = new ShowTotalExpensesController();
        month = Console.readInteger("Insert month");
        year = Console.readInteger("Insert year");
        List<ExpensesperMonthDTO> listExpensesPerMonth = controller.showExpensesByType(month,year);
        if(listExpensesPerMonth != null){
            System.out.println(listExpensesPerMonth);
        }else
            System.out.println("You have no expenses!");
        
    }
    
}
