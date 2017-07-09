/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack2;

import java.util.Arrays;
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
public class Test_Arcade3 {

    Arcade3 a = new Arcade3();

    public Test_Arcade3() {

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
    public void test01_AlmostIncreasingSequence() {
        int[] sequence = {1, 3, 2, 1};
        boolean expResult = false;
        
        System.out.println("1.almostIncreasingSequence test:" + Arrays.toString(sequence));

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void test02_AlmostIncreasingSequence() {
        int[] sequence = {1, 3, 2};
        boolean expResult = true;

        System.out.println("2.almostIncreasingSequence test:" + Arrays.toString(sequence));

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void test03_AlmostIncreasingSequence() {
        int[] sequence = {1, 2, 1, 2};
        boolean expResult = false;

        System.out.println("3.almostIncreasingSequence test:" + Arrays.toString(sequence));

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void test04_AlmostIncreasingSequence() {
        int[] sequence = {1, 4, 10, 4, 2};
        boolean expResult = false;

        System.out.println("almostIncreasingSequence test:" + Arrays.toString(sequence));

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void test05_AlmostIncreasingSequence() {
        int[] sequence = {10, 1, 2, 3, 4, 5};
        boolean expResult = true;

        System.out.println("almostIncreasingSequence test:" + Arrays.toString(sequence));

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }
    
    @org.junit.Test
    public void test06_AlmostIncreasingSequence() {
        int[] sequence = {1, 1, 1, 2, 3};
        boolean expResult = false;

        System.out.println("almostIncreasingSequence test:" + Arrays.toString(sequence));

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }
    
        @org.junit.Test
    public void test07_AlmostIncreasingSequence() {
        int[] sequence = {0, -2, 5, 6};
        boolean expResult = true;

        System.out.println("almostIncreasingSequence test:" + Arrays.toString(sequence));

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }
    
            @org.junit.Test
    public void test08_AlmostIncreasingSequence() {
        int[] sequence = {1, 2, 3, 4, 5, 3, 5, 6};
        boolean expResult = false;

        System.out.println("almostIncreasingSequence test:" + Arrays.toString(sequence));

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }
    
                @org.junit.Test
    public void test15_AlmostIncreasingSequence() {
        int[] sequence = {3, 5, 67, 98, 3};
        boolean expResult = true;

        System.out.println("15.almostIncreasingSequence test:" + Arrays.toString(sequence));

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }
}
