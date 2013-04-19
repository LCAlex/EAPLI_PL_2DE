/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tecnica21
 */
public class ExpenseTest {
    
    public ExpenseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }

    /**
     * Test of toString method, of class Expense.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Expense instance = new Expense();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmount method, of class Expense.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Expense instance = new Expense();
        BigDecimal expResult = null;
        BigDecimal result = instance.getAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmount method, of class Expense.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        BigDecimal amount = null;
        Expense instance = new Expense();
        instance.setAmount(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateOccurred method, of class Expense.
     */
    @Test
    public void testGetDateOccurred() {
        System.out.println("getDateOccurred");
        Expense instance = new Expense();
        Date expResult = null;
        Date result = instance.getDateOccurred();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateOccurred method, of class Expense.
     */
    @Test
    public void testSetDateOccurred() {
        System.out.println("setDateOccurred");
        Date dateOccurred = null;
        Expense instance = new Expense();
        instance.setDateOccurred(dateOccurred);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Expense.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Expense instance = new Expense();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Expense.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Expense instance = new Expense();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpenseMonth method, of class Expense.
     */
    @Test
    public void testGetExpenseMonth() {
        System.out.println("getExpenseMonth");
        Expense instance = new Expense();
        int expResult = 0;
        int result = instance.getExpenseMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpenseYear method, of class Expense.
     */
    @Test
    public void testGetExpenseYear() {
        System.out.println("getExpenseYear");
        Expense instance = new Expense();
        int expResult = 0;
        int result = instance.getExpenseYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpenseWeek method, of class Expense.
     */
    @Test
    public void testGetExpenseWeek() {
        System.out.println("getExpenseWeek");
        Expense instance = new Expense();
        int expResult = 0;
        int result = instance.getExpenseWeek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
