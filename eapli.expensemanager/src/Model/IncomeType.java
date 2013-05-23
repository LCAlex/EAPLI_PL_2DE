/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Tecnica21
 */

@Entity
public class IncomeType {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    
    protected IncomeType() {
    }

    public IncomeType(String name) {
        this.name = name;
    }

    public IncomeType(IncomeType it) {
        if (it == null) {
            throw new IllegalArgumentException();
        }
        this.name = it.name;
    }
    
    @Override
    public String toString() {
        String s = "Name:" + this.name;
        return s;
    }

    public String getName() {
        return this.name;
    }

    public boolean IncomeTypeEquals(IncomeType type) {
        if (this.name.equals(type.name)) {
            return true;
        }
        return false;
    }
}
