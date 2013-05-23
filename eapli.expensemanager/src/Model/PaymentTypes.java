/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
/**
 *
 * @author Joao
 */
public class PaymentTypes {
    
    private ArrayList<String> list = new ArrayList<>();
    
    public void PaymentTypes(){ 
    }
    
    private void preencheLista(){
        list.add("Cash");
        list.add("Check");
        list.add("Debit Card");
        list.add("Credit Card");    
    }
    /**
     * @return the list
     */
    public void getList() {
        preencheLista();
        int i;
        for(i=0;i<list.size();i++){
                System.out.println((i+1)+". "+list.get(i));
            }
    }
}
   
