/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author lmsc
 */
public class ExpenseRecord {
    private List<Expense> list;
    
    public ExpenseRecord(List<Expense> list){
        this.list=list;
    }

    public ExpenseRecord() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    public BigDecimal getTotal(){
        BigDecimal total=new BigDecimal(0);
        for(Expense exp:list){
            total=total.add(exp.getAmount());
        }
        return total;        
    }
}
