/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseRecord;
import Model.ExpenseType;
import ModelView.ExpenseTotal;
import ModelView.ExpensesperMonthDTO;
import Persistance.IExpenseRepository;
import Persistance.IExpenseTypeRepository;
import Persistance.IM.ExpenseRepository;
import Persistance.IM.ExpenseTypeRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author lmsc
 */
public class ShowTotalExpensesController {
    List<Expense> list;
    
    
    public ShowTotalExpensesController(){
    }
    
    public BigDecimal showExpenses(int month, int year){
        ExpenseRepository rep = new ExpenseRepository();
        list=rep.getAllExpenses(month, year);
        ExpenseRecord rec = new ExpenseRecord(list);
        return rec.getTotal();
    }
    
    /**
     * Retorna uma lista de despesas, de determinado mes e ano, agrupadas por tipo de despesa
     * @param month
     * @param year
     * @return result_list
     */
    public List<ExpensesperMonthDTO> showExpensesByType(int month, int year)
    {
        ExpenseRepository       eRepository = new ExpenseRepository();
        ExpenseTypeRepository   eType = new ExpenseTypeRepository();
        
        // Lista com todos os tipos de despesas 
        List<ExpenseType> expenseTypes = eType.getAllExpenseTypes();
         /* Lista de ExpensesperMonthDTO que, para cada tipo de despesa, guarda:
          * nome
          * total
          * lista das despesas */
        List<ExpensesperMonthDTO> resultList = new ArrayList<>();
        
        if (expenseTypes != null && !expenseTypes.isEmpty()) /* Existe(m) tipo(s) de despesa */
        {
            
            for (ExpenseType e: expenseTypes)
            {
                /* Registo de despesas do tipo e */
                ExpenseRecord temp;
		temp = new ExpenseRecord(eRepository.getAllExpensesByType(month, year, e));
                
                /* Total do tipo de despesa e */
                BigDecimal expenseTypeAmmount = temp.getTotal();
                
                /* Objecto DTO que guarda o (nome, total e lista de despesas) do tipo de despesa e */
                ExpensesperMonthDTO myDTO;
                myDTO = new ExpensesperMonthDTO(e.getName(), expenseTypeAmmount, temp);
                
                resultList.add(myDTO);
            }
        }
        
        return resultList;
    }
    
        /**
     * Retorna uma lista de despesas, de determinado mes e ano
     * @param month
     * @param year
     * @return
     */
    public List<ExpenseTotal> showExpenseByTypes(int month, int year){
        IExpenseTypeRepository typeRep = new ExpenseTypeRepository();
        IExpenseRepository rep = new ExpenseRepository();
        ExpenseRecord rec;
        List<ExpenseTotal> temp = new ArrayList();
        for(ExpenseType expType:typeRep.getAllExpenseTypes()){
            rec = new ExpenseRecord(rep.getAllExpensesByType(month, year, expType));
            ExpenseTotal expT = new ExpenseTotal(expType.getName(), rec.getTotal());
            temp.add(expT);
        }
        return temp;
        
    }
}
