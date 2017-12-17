/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.java.arcade.pack3;

import com.codefight.java.arcade.pack3.IsLucky;
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
public class IsLuckyIT {
    
    public IsLuckyIT() {
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
     * Test of IsLucky method, of class IsLucky.
     */
    @Test
    public void testIsLucky() {
        System.out.println("isLucky");
        int n = 1230;
        IsLucky instance = new IsLucky();
        boolean expResult = true;
        boolean result = instance.isLucky(n);
        assertEquals(expResult, result);
    }
    
}
