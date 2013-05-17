/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.IncomeRegisterController;
import Model.IncomeType;
import Model.PaymentMean;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ruben Ferreira
 */
public class IncomeRegisterUI extends BaseUI{
    
    
      IncomeRegisterController controller = new IncomeRegisterController();

      public IncomeRegisterUI() {
       
      }
      
    @Override
    public void header() {
          System.out.println("* * *  REGISTER AN INCOME  * * *\n");
    }
    
    
      public void run() {
       
            String desc = Console.readLine("Description:");
            Date date = Console.readDate("When (dd-MM-yyyy):");
            double value = Console.readDouble("Amount:");
            
            /*
            IncomeTypeRepository incTypeRep = new IncomeTypeRepository(); ---> Deve ser o controlador a aceder a esta informação
            List<IncomeType> list = incTypeRep.getAllIncomeTypes(); ---> Deve ser o controlador a aceder a esta informação
            
            
            displayList(list);
            int nExpType = Console.readInteger("Select Income Type number:");
            */
            
            List<IncomeType> typeList = controller.getAllIncomeTypes();
            displayIncomeTypeList(typeList);
            int nExpType = Console.readInteger("Select Income Type number:");
            
            IncomeType incType = typeList.get(nExpType-1);
            
            BigDecimal amount = new BigDecimal(value);

           /* List<IncomeType> incomeTypeList = controller.getAllIncomeTypes();
            displayPaymentMeansList(incomeTypeList);
            int nPayMean = Console.readInteger("Select Payment Mean number:");
            
            PaymentMean payMean = paymentMeanList.get(nPayMean-1);*/
            
            controller.registerIncome(desc, date, amount, incType);

            System.out.println("Income recorded.");
      }
      
      
       private void displayIncomeTypeList(List<IncomeType> list) {
            int i=0;
            System.out.println("List of Income Types");
            for (IncomeType incType : list) {
                  i=i+1;
                  System.out.println("Income Type "+i+"\n" + incType);
            }
      }

    @Override
    protected BaseController controller() {
        return controller;
    }


       
      
 
    
}
