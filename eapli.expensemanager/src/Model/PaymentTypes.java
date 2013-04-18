/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author Joao
 */
public class PaymentTypes {
    private List<String> list;
    public void PaymentTypes(){
        getList().add("Cash");
        getList().add("Check");
        getList().add("Debit Card");
        getList().add("Credit Card");
    }

    /**
     * @return the list
     */
    public List<String> getList() {
        return list;
    }



}
   
