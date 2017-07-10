/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

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
public class Interview1IT {
    
    public Interview1IT() {
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
     * Test of firstDuplicate method, of class Interview1.
     */
    @Test
    public void test1_FirstDuplicate() {
        
        int[] a = {2, 3, 3, 1, 5, 2};
        System.out.println("1.firstDuplicate: "+ Arrays.toString(a));
        
        Interview1 instance = new Interview1();
        int expResult = 3;
        int result = instance.firstDuplicate(a);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void test2_FirstDuplicate() {
        
        int[] a = {2, 4, 3, 5, 1};
        System.out.println("2.firstDuplicate: "+ Arrays.toString(a));
        
        Interview1 instance = new Interview1();
        int expResult = -1;
        int result = instance.firstDuplicate(a);
        assertEquals(expResult, result);
        
    }    
    
    @Test
    public void test8_FirstDuplicate() {
        
        int[] a = {8, 4, 6, 2, 6, 4, 7, 9, 5, 8};
        System.out.println("8.firstDuplicate: "+ Arrays.toString(a));
        
        Interview1 instance = new Interview1();
        int expResult = 6;
        int result = instance.firstDuplicate(a);
        assertEquals(expResult, result);
        
    }  
}
