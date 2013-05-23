/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli;

import Model.Cash;
import Model.Cheque;
import Model.CreditCard;
import Model.DebitCard;
import Model.Expense;
import Model.ExpenseType;
import Model.Income;
import Model.IncomeType;
import Persistance.IExpenseRepository;
import Persistance.IExpenseTypeRepository;
import Persistance.IIncomeRepository;
import Persistance.IIncomeTypeRepository;
import Persistance.IPaymentMeansRepository;
import Persistance.PersistenceFactory;
import eapli.util.DateTime;
import java.math.BigDecimal;
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
        inicializeIncomes();
    }
    
    private static void inicializeExpenseTypes(){
        IExpenseTypeRepository repoType = PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseTypeRepository();

        repoType.saveExpenseType(new ExpenseType("Vestuario"));
        repoType.saveExpenseType(new ExpenseType("Refeições"));
        repoType.saveExpenseType(new ExpenseType("Transportes"));
        repoType.saveExpenseType(new ExpenseType("Lazer"));
    }
    
    private static void inicializePaymentMeans(){
        IPaymentMeansRepository repoPay = PersistenceFactory.getInstance().buildRepositoryFactory().getPaymentMeanRepository();
        
        repoPay.registerPaymentMean(new Cash("EUR"));
        repoPay.registerPaymentMean(new Cheque(132514, "CGD"));
        repoPay.registerPaymentMean(new CreditCard(DateTime.newDate(2013, 5, 12),842,"BCP","VISA"));
        repoPay.registerPaymentMean(new DebitCard(2342335,"Montepio","MasterCard"));
    }
        
    private static void inicializeExpenses(){
        IExpenseTypeRepository repoType = PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseTypeRepository();
        IPaymentMeansRepository repoPay = PersistenceFactory.getInstance().buildRepositoryFactory().getPaymentMeanRepository();
        IExpenseRepository repo = PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository();
        
        repo.saveExpense(new Expense("Autocarro", 2013, 3, 4, new BigDecimal(2.4),repoType.getAllExpenseTypes().get(2), repoPay.getListPayMeans().get(0)));
        repo.saveExpense(new Expense("Almoço", 2013, 3, 5, new BigDecimal(12.4),repoType.getAllExpenseTypes().get(1), repoPay.getListPayMeans().get(3)));
        repo.saveExpense(new Expense("Sapatilhas", 2013, 3, 4, new BigDecimal(123.4),repoType.getAllExpenseTypes().get(0), repoPay.getListPayMeans().get(1)));
        repo.saveExpense(new Expense("Cinema", 2013, 3, 4, new BigDecimal(5),repoType.getAllExpenseTypes().get(3), repoPay.getListPayMeans().get(2)));
    }
    
    private static void inicializeIncomeTypes(){
        IIncomeTypeRepository repoType = PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeTypeRepository();
        
        repoType.saveIncomeType(new IncomeType("Salário"));
        repoType.saveIncomeType(new IncomeType("Mesada"));
        repoType.saveIncomeType(new IncomeType("Prestação de Serviços"));
        repoType.saveIncomeType(new IncomeType("Segurança Social"));
    }
    
    private static void inicializeIncomes(){
        IIncomeTypeRepository repoType = PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeTypeRepository();
        IIncomeRepository repo = PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeRepository();

        repo.saveIncome(new Income("Vencimento Abril", DateTime.newDate(2013, 4, 5), new BigDecimal(750), repoType.getAllIncomeTypes().get(0)));
        repo.saveIncome(new Income("Mesada de Abril", DateTime.newDate(2013, 3, 1), new BigDecimal(125), repoType.getAllIncomeTypes().get(1)));
        repo.saveIncome(new Income("Limpeza do Automóvel do Vizinho", DateTime.newDate(2013, 4, 12), new BigDecimal(15), repoType.getAllIncomeTypes().get(2)));
        repo.saveIncome(new Income("Subsídio Desemprego", DateTime.newDate(2013, 3, 23), new BigDecimal(380), repoType.getAllIncomeTypes().get(3)));
    }
    
}
