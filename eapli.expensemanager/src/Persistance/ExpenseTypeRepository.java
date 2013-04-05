/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;

import Model.ExpenseType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Tecnica21
 */
public class ExpenseTypeRepository implements IExpenseTypeRepository{
    
    private static List<ExpenseType> listExpenseType= new ArrayList<>();
    
    public ExpenseTypeRepository(){}
    
    public void saveExpenseType(ExpenseType et){
        if (et==null) {
            throw new IllegalArgumentException();
        }
        listExpenseType.add(et);
        System.out.println("Tipo de Despesa adicionado com sucesso.");
    }
    
    public List<ExpenseType> getAllExpenseTypes() {
        return Collections.unmodifiableList(listExpenseType); // Retorna uma cópia da lista original
    }
}
