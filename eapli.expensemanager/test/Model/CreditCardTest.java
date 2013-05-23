/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.util.Date;
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
public class CreditCardTest {
    Date d;
    
    public CreditCardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        d = DateTime.parseDate("20-05-2015");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class CreditCard.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CreditCard instance = new CreditCard(d,84515412,"BCP","VISA");
        String expResult ="Numero: 84515412" + "\nInst. Bancaria: BCP" + "\nTipo: VISA" +"\nData de Validade: Wed May 20 00:00:00 BST 2015";
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }
}
