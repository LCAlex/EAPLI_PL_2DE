/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance.IM;

import Model.Income;
import Model.IncomeType;
import Persistance.IIncomeRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Ruben Ferreira
 */
public class IncomeRepository implements IIncomeRepository {

    private static List<Income> listIncome = new ArrayList<>();

    public IncomeRepository() {
    }

    @Override
    public void saveIncome(Income inc) {
        if (inc == null) {
            throw new IllegalArgumentException();
        }
        listIncome.add(inc);
    }

    @Override
    public List<Income> getAllIncomes() {
        return Collections.unmodifiableList(listIncome); // Retorna uma cópia da lista original
    }
    /* @Override
     public void showIncomeList() {
     if(listIncome.isEmpty())
     {
     System.out.println("LIST IS EMPTY!\n");
     }
     else
     {
     for(int i=0; i < listIncome.size();i++)
     { 
     System.out.println("- "+listIncome.get(i));                 
     }
     System.out.println("\n");
     }
     }*/
    /* public Income getLastIncome() {
     Income inc = null;
     Income copy = null;
        
     int size = listIncome.size();
        
     if(size>0){
     inc=listIncome.get(size-1);
     }
        
     if(inc!=null){
     copy = new Income(inc);
     }
        
     return copy;
     }
     */
    /*  @Override
     public List<Income> getAllIncomes(int month, int year) {
     List<Income> temp = new ArrayList<>();
     for(Income inc:listIncome){
     if(inc.getIncomeMonth()==month && inc.getIncomeYear()==year){
     temp.add(inc);
     }
     }
     return temp;
     }*/
    /* public List<Income> getAllIncomesWeek(int week, int year) {
     List<Income> temp = new ArrayList<>();
     for(Income inc:listIncome){
     if(inc.getIncomeWeek()==week && inc.getIncomeYear()==year){
     temp.add(inc);
     }
     }
     return temp;
     }
     public List<Income> getAllIncomesByType(int month, int year, IncomeType type) {
     List<Income> temp = new ArrayList<>();
     for(Income inc:listIncome){
     if(inc.getIncomeMonth()==month && inc.getIncomeYear()==year && inc.getExpType().IncomeTypeEquals(type)){
     temp.add(inc);
     }
     }
     return temp;
     }*/
}
