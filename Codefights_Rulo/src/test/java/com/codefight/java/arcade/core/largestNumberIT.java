/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.java.arcade.core;

import com.codefight.java.arcade.core.largestNumber;
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
public class largestNumberIT {
    
    public largestNumberIT() {
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
     * Test of largestNumber method, of class largestNumber.
     */
    @Test
    public void testLargestNumber() {
        System.out.println("largestNumber");
        int n = 2;
        largestNumber instance = new largestNumber();
        int expResult = 99;
        int result = instance.largestNumber(n);
        assertEquals(expResult, result);
    }
    
}
