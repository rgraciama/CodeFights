/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.java.arcade.core;

import com.codefight.java.arcade.core.LargestNumber;
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
public class LargestNumberIT {
    
    public LargestNumberIT() {
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
     * Test of LargestNumber method, of class LargestNumber.
     */
    @Test
    public void testLargestNumber() {
        System.out.println("largestNumber");
        int n = 2;
        LargestNumber instance = new LargestNumber();
        int expResult = 99;
        int result = instance.largestNumber(n);
        assertEquals(expResult, result);
    }
    
}
