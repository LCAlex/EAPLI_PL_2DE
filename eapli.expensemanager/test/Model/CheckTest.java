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
public class CheckTest {
    
    public CheckTest() {
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
     * Test of toString method, of class Cheque.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cheque instance = new Cheque(200,"Caixa");
        String expResult ="Numero: 200" + "\nInst. Bancaria: Caixa";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
