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
public class PaymentMeanTest {
    
    public PaymentMeanTest() {
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
     * Test of toString method, of class PaymentMean.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PaymentMean instance = new PaymentMeanImpl();
        String expResult = "ID:0";
        String result = instance.toString();
        assertEquals(expResult, result);
      
    }

    public class PaymentMeanImpl extends PaymentMean {
    }
}
