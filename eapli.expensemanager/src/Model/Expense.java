/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Tecnica21
 */
public class Expense {
    private String description;
    private BigDecimal amount;
    
    protected Expense(){
        
    }
    
    public Expense(String description, Date dateOcurred, BigDecimal amount){
        if(description==null || dateOcurred==null || amount==null){
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if(amount.signum() == -1 || amount.signum() == 0){
            throw new IllegalArgumentException();
        }
        
        this.description = description;
        this.amount = amount;
    }
}
