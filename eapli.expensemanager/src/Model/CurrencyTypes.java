/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.Console;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joao
 */
public class CurrencyTypes {
    private ArrayList<String> list=new ArrayList<String>();
    
    public void CurrencyTypes(){
        list.add("EUR");
        list.add("USD");
        list.add("GBP");
        list.add("AUD");
    }

    /**
     * @return the list
     */
    public ArrayList<String> getList() {
        return list;
    }
    
    public String getCurrencyList(){
        System.out.println("* * *  WHAT TYPE OF CURRENCY?  * * *");
        System.out.println("===================\n");
        for(int i=0;i<list.size();i++){
                System.out.println(i+". "+list.get(i));
        }
        System.out.println("0. Exit\n\n");
        int option = Console.readInteger("Please choose an option");
        return list.get(option-1);
        
    }
}
