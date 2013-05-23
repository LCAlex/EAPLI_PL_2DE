/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controllers.IncomeController;
import Controllers.ShowExpensesController;
import Persistance.IExpenseRepository;
import Persistance.IIncomeRepository;
import Persistance.IM.ExpenseRepository;
import Persistance.IM.IncomeRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Magalhaes
 */
public class AccountServices {

    private static List<Income> listInc = new ArrayList<>();
    private static List<Expense> listExp = new ArrayList<>();
    IncomeRepository repi = new IncomeRepository();
    ExpenseRepository repe = new ExpenseRepository();

    public BigDecimal getBalance() {

        BigDecimal totalExp = BigDecimal.ZERO;
        BigDecimal totalInc = BigDecimal.ZERO;
        BigDecimal total = BigDecimal.ZERO;

        listExp = repe.getAllExpenses();
        listInc = repi.getAllIncomes();

        for (int i = 0; i < listExp.size(); i++) {
            totalExp = totalExp.add(listExp.get(i).getAmount());
        }

        for (int i = 0; i < listInc.size(); i++) {
            totalInc = totalInc.add(listInc.get(i).getAmount());
        }
        total = round(totalInc, 2, true).subtract(round(totalExp, 2, true));
        return total;
    }
    //metodo para arredondar BigDecimal

    private static BigDecimal round(BigDecimal d, int scale, boolean roundUp) {
        int mode = (roundUp) ? BigDecimal.ROUND_UP : BigDecimal.ROUND_DOWN;
        return d.setScale(scale, mode);
    }
}
