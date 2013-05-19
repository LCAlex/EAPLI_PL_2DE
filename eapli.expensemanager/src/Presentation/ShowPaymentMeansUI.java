/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.PaymentMeansController;

/**
 *
 * @author Ruben Ferreira
 */
public class ShowPaymentMeansUI extends BaseUI {

    PaymentMeansController pmc = new PaymentMeansController();
    
    ShowPaymentMeansUI()
    {
    }

    @Override
    public void header() {
        System.out.println("* * *  LIST OF PAYMENT MEANS  * * *");
    }

    @Override
    public void run() {
        pmc.showPaymentMeansList();
    }

    @Override
    protected BaseController controller() {
        return pmc;
    }
}
