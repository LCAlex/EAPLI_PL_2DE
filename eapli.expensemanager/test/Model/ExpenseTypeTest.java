/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Barrakeiro
 */
public class ExpenseTypeTest {
    
    public ExpenseTypeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class ExpenseType.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ExpenseType instance = new ExpenseType("Vestuario");
        String expResult = "Name:Vestuario";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class ExpenseType.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        ExpenseType instance = new ExpenseType("name");
        String expResult = "name";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
}