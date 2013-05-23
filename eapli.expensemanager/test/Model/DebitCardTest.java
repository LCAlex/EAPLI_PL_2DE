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
public class DebitCardTest {
    
    public DebitCardTest() {
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
     * Test of toString method, of class DebitCard.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        DebitCard instance = new DebitCard(4,2342335,"Montepio","MasterCard");
        String expResult = "ID:4" + "\nNumero: 2342335" + "\nInst. Bancaria: Montepio" + "\nTipo: MasterCard";
        String result = instance.toString();
        assertEquals(expResult, result);

    }
}
