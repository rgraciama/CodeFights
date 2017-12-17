/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.java.arcade.pack3;

import com.codefight.java.arcade.pack3.Arcade10;
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
public class Arcade10IT {
    
    public Arcade10IT() {
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
     * Test of commonCharacterCount method, of class Arcade10.
     */
    @Test
    public void testCommonCharacterCount() {
        System.out.println("commonCharacterCount");
        String s1 = "aabcc";
        String s2 = "adcaa";
        Arcade10 instance = new Arcade10();
        int expResult = 3;
        int result = instance.commonCharacterCount(s1, s2);
        assertEquals(expResult, result);
        
    }
    
            /**
     * Test of commonCharacterCount method, of class Arcade10.
     */
    @Test
    public void test2CommonCharacterCount() {
        System.out.println("commonCharacterCount");
        String s1 = "zzzz";
        String s2 = "zzzzzzz";
        Arcade10 instance = new Arcade10();
        int expResult = 4;
        int result = instance.commonCharacterCount(s1, s2);
        assertEquals(expResult, result);
        
    }
    
        /**
     * Test of commonCharacterCount method, of class Arcade10.
     */
    @Test
    public void test3CommonCharacterCount() {
        System.out.println("commonCharacterCount");
        String s1 = "abca";
        String s2 = "xyzbac";
        Arcade10 instance = new Arcade10();
        int expResult = 3;
        int result = instance.commonCharacterCount(s1, s2);
        assertEquals(expResult, result);
        
    }
    
}
