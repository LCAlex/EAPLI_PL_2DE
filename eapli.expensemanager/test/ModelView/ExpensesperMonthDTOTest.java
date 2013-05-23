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
 * @author mcatia
 */
public class ExpensesperMonthDTOTest {

    public ExpensesperMonthDTOTest() {
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
     * Test of getExpenseType method, of class ExpensesperMonthDTO.
     */
    @Test
    public void testGetExpenseType() {
        System.out.println("getExpenseType");
        ExpensesperMonthDTO instance = new ExpensesperMonthDTO("Vestuario", null, null);
        String expResult = "Vestuario";
        String result = instance.getExpenseType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getExpenseTotal method, of class ExpensesperMonthDTO.
     */
    @Test
    public void testGetExpenseTotal() {
        System.out.println("getExpenseTotal");
        ExpensesperMonthDTO instance = new ExpensesperMonthDTO("", (new BigDecimal(30)), null);
        BigDecimal expResult = new BigDecimal(30);
        BigDecimal result = instance.getExpenseTotal();
        assertEquals(expResult, result);
    }

    /**
     * Test of getExpenses method, of class ExpensesperMonthDTO.
     */
//    @Test
//    public void testGetExpenses() {
//        System.out.println("getExpenses");
//        Expense e = new Expense("Calcas", new Date(), new BigDecimal(30),
//                new ExpenseType("Vestuario"), new PaymentMean(1) {});
//        
//        List<Expense> list = new ArrayList<>();
//        list.add(e);
//
//        ExpensesperMonthDTO instance =
//                new ExpensesperMonthDTO("", null, new ExpenseRecord(list));
//        
//        ExpenseRecord expResult = new ExpenseRecord(list);
//        ExpenseRecord result = instance.getExpenses();
//        assertTrue(expResult.equals(result));
////        assertEquals(expResult, result);
//    }
}