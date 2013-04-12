/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Eapli;

import Model.ExpenseType;
import Persistance.ExpenseTypeRepository;
import Persistance.IExpenseTypeRepository;

/**
 *
 * @author Barrakeiro
 */
public class ExpenseTypeBootstrapper {
        static{
        IExpenseTypeRepository repo = new ExpenseTypeRepository();
        
        repo.saveExpenseType(new ExpenseType("Vestuario"));
        repo.saveExpenseType(new ExpenseType("Refeições"));
        repo.saveExpenseType(new ExpenseType("Transportes"));
        repo.saveExpenseType(new ExpenseType("Lazer"));
    }
}

