/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance.IM;

import Model.IncomeType;
import Persistance.IIncomeTypeRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Tecnica21
 */
public class IncomeTypeRepository implements IIncomeTypeRepository{
    
    private static List<IncomeType> listIncomeType = new ArrayList<>();
    
    public IncomeTypeRepository(){}
    
    @Override
    public void saveIncomeType(IncomeType it){
        boolean iguais=false;
        
        for(int i=0;i<listIncomeType.size();i++){
            if(it.getName().equalsIgnoreCase(listIncomeType.get(i).getName())){
                iguais=true;
            }
        }
        
        if (it==null) {
            throw new IllegalArgumentException();
        }
            
        if(iguais==true){
            System.out.println("Tipo de Rendimento já existente. Por favor, insira um nome diferente.");
        }else{
            listIncomeType.add(it);
            System.out.println("Tipo de Rendimento adicionado com sucesso.");
        }
    }
    
    public List<IncomeType> getAllIncomeTypes() {
        return Collections.unmodifiableList(listIncomeType); // Retorna uma cópia da lista original
    }
}
