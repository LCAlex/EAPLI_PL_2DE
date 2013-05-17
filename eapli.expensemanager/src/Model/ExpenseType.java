/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Tecnica21
 */

@Entity
public class ExpenseType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
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
