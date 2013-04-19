/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelView;

import java.math.BigDecimal;
import Model.ExpenseRecord;

/**
 *
 * @author jose
 */
public class ExpensesperMonthDTO {
    
    private String      expense_type;
    private BigDecimal  ammount;
    private ExpenseRecord expenses;
    
    public ExpensesperMonthDTO(String expense_type, BigDecimal ammount, ExpenseRecord expenses)
    {
        this.expense_type = expense_type;
        this.ammount = ammount;
        this.expenses = expenses;
    }
    
    public String getExpenseType()
    {
        return this.expense_type;
    }
    
    public BigDecimal getExpenseTotal()
    {
        return this.ammount;
    }
    
    public ExpenseRecord getExpenses()
    {
        return this.expenses;
    }
    
}
