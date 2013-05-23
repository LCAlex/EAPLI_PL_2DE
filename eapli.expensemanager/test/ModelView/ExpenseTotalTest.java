/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelView;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jose
 */
public class ExpenseTotalTest {
    
    public ExpenseTotalTest() {
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
     * Test of getExpenseType method, of class ExpenseTotal.
     */
    @Test
    public void testGetExpenseType() {
	System.out.println("getExpenseType");
	ExpenseTotal instance = new ExpenseTotal("Transportes", null);
	String expResult = "Transportes";
	String result = instance.getExpenseType();
	assertEquals(expResult, result);
    }

    /**
     * Test of getExpenseTotal method, of class ExpenseTotal.
     */
    @Test
    public void testGetExpenseTotal() {
	System.out.println("getExpenseTotal");
	ExpenseTotal instance = new ExpenseTotal(null, new BigDecimal(3));
	BigDecimal expResult = new BigDecimal(3);
	BigDecimal result = instance.getExpenseTotal();
	assertEquals(expResult, result);
    }
}