/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Tecnica21
 */

//@Entity
//@Table(name="EXPENSE_TYPE_INFO")
public class ExpenseType {

    //@Id
    //@Column(name="ID")
    //private int expenseTypeId;
    
    private String name;

    protected ExpenseType() {
    }

    public ExpenseType(String name) {
        this.name = name;
    }

    public ExpenseType(ExpenseType et) {
        if (et == null) {
            throw new IllegalArgumentException();
        }
        this.name = et.name;
    }

    @Override
    public String toString() {
        String s = "Name:" + this.name;
        return s;
    }

    public String getName() {
        return this.name;
    }

    public boolean ExpenseTypeEquals(ExpenseType type) {
        if (this.name.equals(type.name)) {
            return true;
        }
        return false;
    }
}
