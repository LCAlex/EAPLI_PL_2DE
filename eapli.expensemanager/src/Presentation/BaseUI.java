/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Tecnica21
 */
public abstract class BaseUI {
    
    protected abstract BaseController controller();
    public abstract void header();
    public abstract void run();

    public void show(){
        header();
        run();
        showBalances();
    }
    
    public void showBalances(){
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        BigDecimal wb = controller().getThisWeekExpenses();
        BigDecimal mb = controller().getThisMonthExpenses();
        double val1 = wb.doubleValue();
        double val2 = mb.doubleValue();
        System.out.println("Weekly ependiture " + n.format(val1));
        System.out.println("Monthly ependiture " + n.format(val2));
    }
    
}
