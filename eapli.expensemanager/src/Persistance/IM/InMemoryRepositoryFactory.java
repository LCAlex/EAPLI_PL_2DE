/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance.IM;


import Persistance.IExpenseRepository;
import Persistance.IExpenseTypeRepository;
import Persistance.IPaymentMeansRepository;
import Persistance.IRepositoryFactory;

/**
 *
 * @author Rui Damiao
 */
public class InMemoryRepositoryFactory implements IRepositoryFactory{

    @Override
    public IExpenseRepository getExpenseRepository(){
        return new Persistance.IM.ExpenseRepository();
    }
    
    @Override
    public IExpenseTypeRepository getExpenseTypeRepository(){
        return new Persistance.IM.ExpenseTypeRepository();
    }
     
    @Override
    public IPaymentMeansRepository getPaymentMeanRepository(){
        return new Persistance.IM.PaymentMeansRepository();
    }
}
