/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack3;

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
public class sortByHeightIT {
    
    public sortByHeightIT() {
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
     * Test of sortByHeight method, of class sortByHeight.
     */
    @Test
    public void testSortByHeight() {
        System.out.println("sortByHeight");
        int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        sortByHeight instance = new sortByHeight();
        int[] expResult = {-1, 150, 160, 170, -1, -1, 180, 190};
        int[] result = instance.sortByHeight(a);
        assertArrayEquals(expResult, result);
    }
    
    
    @Test
    public void test2SortByHeight() {
        System.out.println("sortByHeight");
        int[] a = {-1, -1, -1, -1, -1};
        sortByHeight instance = new sortByHeight();
        int[] expResult = {-1, -1, -1, -1, -1};
        int[] result = instance.sortByHeight(a);
        assertArrayEquals(expResult, result);
    }
    
        @Test
    public void test3SortByHeight() {
        System.out.println("sortByHeight");
        int[] a = {4, 2, 9, 11, 2, 16};
        sortByHeight instance = new sortByHeight();
        int[] expResult = {2, 2, 4, 9, 11, 16};
        int[] result = instance.sortByHeight(a);
        assertArrayEquals(expResult, result);
    }
    
}
