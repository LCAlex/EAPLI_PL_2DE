/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelView;

import java.math.BigDecimal;

/**
 *
 * @author jose
 */
public class ExpenseTotal {
    
    private String      expense_type; 
    private BigDecimal  expense_total;
    
    public ExpenseTotal(String expense_type, BigDecimal expense_total)
    {
        this.expense_type = expense_type;
        this.expense_total = expense_total;
    }
    
    public String getExpenseType()
    {
        return this.expense_type;
    }
    
    public BigDecimal getExpenseTotal()
    {
        return this.expense_total;
    }
    
}
