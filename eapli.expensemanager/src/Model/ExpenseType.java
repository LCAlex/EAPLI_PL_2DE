/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Tecnica21
 */
public class ExpenseType {
    private String name;
    
    protected ExpenseType(){}
    
    public ExpenseType(String name){
        this.name = name;
    }
    
    public ExpenseType(ExpenseType et){
        if(et==null){
            throw new IllegalArgumentException();
        }
        this.name=et.name;
    }
    
    @Override
    public String toString(){
        String s = "Name:" + this.name;
        return s;
    }
    
    public String getName(){
        return this.name;
    }
}
