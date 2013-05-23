/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package Persistance;

/**
*
* @author Tecnica21
*/
public interface IRepositoryFactory {
      IExpenseTypeRepository getExpenseTypeRepository();
      IExpenseRepository getExpenseRepository();
      IPaymentMeansRepository getPaymentMeanRepository();
      IIncomeTypeRepository getIncomeTypeRepository();
      IIncomeRepository getIncomeRepository();
}