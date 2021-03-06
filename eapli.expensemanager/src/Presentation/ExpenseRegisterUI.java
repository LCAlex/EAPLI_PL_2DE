/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Model.ExpenseType;
import Persistance.IM.ExpenseTypeRepository;
import Controllers.ExpenseRegisterController;
import Model.PaymentMean;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mcn
 */
public class ExpenseRegisterUI extends BaseUI {

    ExpenseRegisterController controller = new ExpenseRegisterController();

    @Override
    public void header() {
        System.out.println("* * *  REGISTER AN EXPENSE  * * *\n");
    }

    public ExpenseRegisterUI() {
    }

    public void run() {

        String desc = Console.readLine("Description:");
        Date date = Console.readDate("When (dd-MM-yyyy):");
        double value = Console.readDouble("Amount:");

        /*
         ExpenseTypeRepository expTypeRep = new ExpenseTypeRepository(); ---> Deve ser o controlador a aceder a esta informação
         List<ExpenseType> list = expTypeRep.getAllExpenseTypes(); ---> Deve ser o controlador a aceder a esta informação
            
            
         displayList(list);
         int nExpType = Console.readInteger("Select Expense Type number:");
         */

        List<ExpenseType> typeList = controller.getAllExpenseTypes();
        displayExpenseTypeList(typeList);
        int nExpType = Console.readInteger("Select Expense Type number:");

        ExpenseType expType = typeList.get(nExpType - 1);

        BigDecimal amount = new BigDecimal(value);

        List<PaymentMean> paymentMeanList = controller.getAllPaymentMeans();
        displayPaymentMeansList(paymentMeanList);
        int nPayMean = Console.readInteger("Select Payment Mean number:");

        PaymentMean payMean = paymentMeanList.get(nPayMean - 1);

        controller.registerExpense(desc, date, amount, expType, payMean);

        System.out.println("expense recorded.");
    }

    private void displayExpenseTypeList(List<ExpenseType> list) {
        int i = 0;
        System.out.println("List of Expense Types");
        for (ExpenseType expType : list) {
            i = i + 1;
            System.out.println("Expense Type " + i + "\n" + expType);
            System.out.println();
        }
    }

    private void displayPaymentMeansList(List<PaymentMean> list) {
        int i = 0;
        System.out.println("* * *  WHAT TYPE OF MEAN DO YOU WISH TO ADD?  * * *");
        System.out.println("===================\n"); 
        for (PaymentMean payMean : list) {
            i = i + 1;
            System.out.println("Payment Mean " + i + "\n" + payMean);
            System.out.println();
        }
    }

    @Override
    protected BaseController controller() {
        return controller;
    }
}
