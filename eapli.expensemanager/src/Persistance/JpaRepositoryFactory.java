/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;

import Persistance.IExpenseRepository;
import Persistance.IExpenseTypeRepository;
import Persistance.IPaymentMeansRepository;
import javax.persistence.Persistence;

/**
 *
 * @author lmsc
 */
public class JpaRepositoryFactory implements IRepositoryFactory{
   @Override
    public IExpenseRepository getExpenseRepository(){
        return new Persistance.JPA.ExpenseJpa();
    }
    
    @Override
    public IExpenseTypeRepository getExpenseTypeRepository(){
        return new Persistance.JPA.ExpenseTypeJpa();
    }
     
    @Override
    public IPaymentMeansRepository getPaymentMeanRepository(){
        return new Persistance.JPA.PaymentMeansJPA();
    }
    
    @Override
    public IIncomeTypeRepository getIncomeTypeRepository(){
        return new Persistance.JPA.IncomeTypeJpa();
    }
    
    @Override
    public IIncomeRepository getIncomeRepository(){
        return new Persistance.JPA.IncomeJPA();
    }
}
