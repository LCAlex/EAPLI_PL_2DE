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
import Persistance.PersistenceFactory;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Magalhaes
 */
public class AccountServices {

    

    public BigDecimal getBalance() {

        List<Income> listInc = new ArrayList<>();
        List<Expense> listExp = new ArrayList<>();
        IIncomeRepository repi = PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeRepository();
        IExpenseRepository repe = PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository();
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
