/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rulo
 */
public class Arcade3IT {
    
    public Arcade3IT() {
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
     * Test of almostIncreasingSequence method, of class Arcade3.
     */
    @org.junit.Test
    public void testAlmostIncreasingSequence() {
        System.out.println("almostIncreasingSequence");
        int[] sequence = null;
        Arcade3 instance = new Arcade3();
        boolean expResult = false;
        boolean result = instance.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incrementalArray method, of class Arcade3.
     */
    @org.junit.Test
    public void testIncrementalArray() {
        System.out.println("incrementalArray");
        int[] array = null;
        Arcade3 instance = new Arcade3();
        boolean expResult = false;
        boolean result = instance.incrementalArray(array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
