/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli;

import Model.Cash;
import Model.Check;
import Model.CreditCard;
import Model.DebitCard;
import Model.Expense;
import Model.ExpenseType;
import Model.IncomeType;
import Persistance.IM.ExpenseRepository;
import Persistance.IM.ExpenseTypeRepository;
import Persistance.IExpenseRepository;
import Persistance.IExpenseTypeRepository;
import Persistance.IIncomeTypeRepository;
import Persistance.IM.IncomeTypeRepository;
import Persistance.IPaymentMeansRepository;
import Persistance.IM.PaymentMeansRepository;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Tecnica21
 */
public class BootstrapperClass {
    static{
        inicializeExpenseTypes();
        inicializePaymentMeans();
        inicializeExpenses();
        inicializeIncomeTypes();
    }
    
    private static void inicializeExpenseTypes(){
        IExpenseTypeRepository repoType = new ExpenseTypeRepository();

        repoType.saveExpenseType(new ExpenseType("Vestuario"));
        repoType.saveExpenseType(new ExpenseType("Refeições"));
        repoType.saveExpenseType(new ExpenseType("Transportes"));
        repoType.saveExpenseType(new ExpenseType("Lazer"));
    }
    
    private static void inicializePaymentMeans(){
        IPaymentMeansRepository repoPay = new PaymentMeansRepository();
        
        repoPay.registerPaymentMean(new Cash(1,"EUR"));
        repoPay.registerPaymentMean(new Check(2,132514, "CGD"));
        repoPay.registerPaymentMean(new CreditCard(3,new Date(),84515412,"BCP","VISA"));
        repoPay.registerPaymentMean(new DebitCard(4,2342335,"Montepio","MasterCard"));
    }
        
    private static void inicializeExpenses(){
        IExpenseTypeRepository repoType = new ExpenseTypeRepository();
        IPaymentMeansRepository repoPay = new PaymentMeansRepository();
        IExpenseRepository repo = new ExpenseRepository();
        
        repo.saveExpense(new Expense("Autocarro", 2013, 3, 4, new BigDecimal(2.4),repoType.getAllExpenseTypes().get(2), repoPay.getListPayMeans().get(0)));
        repo.saveExpense(new Expense("Almoço", 2013, 3, 5, new BigDecimal(12.4),repoType.getAllExpenseTypes().get(1), repoPay.getListPayMeans().get(3)));
        repo.saveExpense(new Expense("Sapatilhas", 2013, 3, 4, new BigDecimal(123.4),repoType.getAllExpenseTypes().get(0), repoPay.getListPayMeans().get(1)));
        repo.saveExpense(new Expense("Cinema", 2013, 3, 4, new BigDecimal(5),repoType.getAllExpenseTypes().get(3), repoPay.getListPayMeans().get(2)));
    }
    
    private static void inicializeIncomeTypes(){
        IIncomeTypeRepository repoType = new IncomeTypeRepository();
        
        repoType.saveIncomeType(new IncomeType("Salário"));
        repoType.saveIncomeType(new IncomeType("Mesada"));
        repoType.saveIncomeType(new IncomeType("Prestação de Serviços"));
        repoType.saveIncomeType(new IncomeType("Segurança Social"));
    }
    
}