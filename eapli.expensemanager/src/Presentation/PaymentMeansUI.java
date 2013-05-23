/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.PaymentMeansController;
import Model.Cash;
import Model.CurrencyTypes;
import Model.PaymentMean;
import Model.PaymentTypes;
import eapli.util.Console;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ruben Ferreira
 */
public class PaymentMeansUI extends BaseUI {

    PaymentMeansController pmc = new PaymentMeansController();
    CurrencyTypes ct = new CurrencyTypes();
    static int ID = 0;
    int id;
    private static List<PaymentMean> listPayMeansAUX = new ArrayList<>();
    

    public PaymentMeansUI() {
    }

    @Override
    public void header() {
        System.out.println("* * *  REGISTER A PAYMENT MEAN  * * *");
    }

    @Override
    public void run() {

        int op;
        do {
            listPayMeansAUX = pmc.getListPaymentMeans();
            op = menu();
            switch (op) {
                case 0:
                    break;
                case 1:
                    System.out.println("You chose to add Cash:");
                    boolean flag = false;
                    PaymentMean aux;
                    
                    for (int i = 0; i < listPayMeansAUX.size(); i++) {
                        aux = listPayMeansAUX.get(i);
                        if (aux instanceof Cash) {
                            System.out.println("Cash already exists!");
                            flag = true;
                            break;
                        }
                    }
                    if (flag == false)
                    {
                    String currency = ct.getCurrencyList();        
                    pmc.registerCash(currency);
                    System.out.println("Payment mean added to the repository.");
                    ID++;
                    }
                    break;
                case 2:
                    System.out.println("You chose to add a Check:");

                    String instBanc = Console.readLine("Bank:");
                    int num = Console.readInteger("Check Number:");

                    pmc.registerCheck(num, instBanc);
                    System.out.println("Payment mean added to the repository.");
                    ID++;
                    break;
                case 3:
                    System.out.println("You chose to add a Debit Card:");

                    String instB = Console.readLine("Bank:");
                    String tipo = Console.readLine("Type:");
                    int num1 = Console.readInteger("Card Number:");

                    pmc.registerDCard(num1, instB, tipo);
                    System.out.println("Payment mean added to the repository.");
                    ID++;
                    break;
                case 4:
                    System.out.println("You chose to add a Credit Card:");

                    String instBa = Console.readLine("Bank:");
                    String tipo1 = Console.readLine("Type:");
                    int num2 = Console.readInteger("Card Number:");
                    Date d1 = Console.readDate("Expiration Date: ");

                    pmc.registerCCard(d1, num2, instBa, tipo1);
                    System.out.println("Payment mean added to the repository.");
                    ID++;
                    break;
                default:
                    break;
            }
        } while (op != 0);
    }

    private int menu() {

        System.out.println("* * *  LIST OF PAYMENT MEANS  * * *\n");
        //lista todos os meios guardados no repositório
        //listPayMeansAUX = pmc.getListPaymentMeans();
        if(listPayMeansAUX.isEmpty())    
       {
           System.out.println("LIST IS EMPTY!\n");
       }
       else
       {
           for(int i=0; i < listPayMeansAUX.size();i++)
           { 
               System.out.println("- "+atribuiNome(listPayMeansAUX.get(i)));  
               System.out.println(listPayMeansAUX.get(i));                 
           }
           System.out.println("\n");
       }
       

        System.out.println("* * *  WHAT TYPE OF MEAN DO YOU WISH TO ADD?  * * *");
        System.out.println("===================\n"); 
        PaymentTypes pmt = new PaymentTypes();
        pmt.getList();
        System.out.println("0. Exit\n\n");

        int option = Console.readInteger("Please choose an option");
        return option;
    }

    /*   @Override
     public void show(){
     header();
     run();
     showBalances();
     }*/
    @Override
    protected BaseController controller() {
        return pmc;
    }
    
     private String atribuiNome(PaymentMean pm){
         String nome = null;
         
         if("Model.Cash".equals(pm.getClass().getName()))
             nome = "Cash";
         if("Model.Check".equals(pm.getClass().getName()))
             nome = "Check";
         if("Model.CreditCard".equals(pm.getClass().getName()))
             nome = "Credit Card";
         if("Model.DebitCard".equals(pm.getClass().getName()))
             nome = "Debit Card";
       
      return nome;
   }
}
