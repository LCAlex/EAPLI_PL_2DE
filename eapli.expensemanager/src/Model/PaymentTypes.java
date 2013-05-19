/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joao
 */
public class PaymentTypes {
    
    private ArrayList<String> list=new ArrayList<String>();
    public void PaymentTypes(){
        list.add("Cash");
        list.add("Check");
        list.add("Debit Card");
        list.add("Credit Card");
        
    }

    /**
     * @return the list
     */
    public void getList() {
        for(int i=0;i<list.size();i++){
                System.out.println(i+". "+list.get(i));
            }
    }
}
   
