/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tecnica21
 */
public class PaymentMeansUITest {
    
    public PaymentMeansUITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of run method, of class PaymentMeansUI.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        PaymentMeansUI instance = new PaymentMeansUI();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PaymentMeanUIMain method, of class PaymentMeansUI.
     */
    @Test
    public void testPaymentMeanUIMain() {
        System.out.println("PaymentMeanUIMain");
        PaymentMeansUI instance = new PaymentMeansUI();
        instance.show();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
