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
 * @author Zé
 */
public class CashTest {
    
    public CashTest() {
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
     * Test of toString method, of class Cash.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cash instance = new Cash(2,"EUR");
        String expResult = "ID:2" + "\nCurrency: EUR";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCurrency method, of class Cash.
     */
    @Test
    public void testGetCurrency() {
        System.out.println("getCurrency");
        Cash instance = new Cash(0,"Euro");
        String expResult = "Euro";
        String result = instance.getCurrency();
        assertEquals(expResult, result);
    }

}
