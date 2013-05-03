/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance.IM;

import Model.ExpenseType;
import Persistance.IExpenseTypeRepository;
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
        boolean iguais=false;
        
        for(int i=0;i<listExpenseType.size();i++){
            if(et.getName().equalsIgnoreCase(listExpenseType.get(i).getName())){
                iguais=true;
            }
        }
        
        if (et==null) {
            throw new IllegalArgumentException();
        }
            
        if(iguais==true){
            System.out.println("Tipo de Despesa já existente. Por favor, insira um nome diferente.");
        }else{
            listExpenseType.add(et);
            System.out.println("Tipo de Despesa adicionado com sucesso.");
        }
    }
    
    public List<ExpenseType> getAllExpenseTypes() {
        return Collections.unmodifiableList(listExpenseType); // Retorna uma cópia da lista original
    }
}
