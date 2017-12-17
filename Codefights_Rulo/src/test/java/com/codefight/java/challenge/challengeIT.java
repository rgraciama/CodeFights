/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.java.challenge;

import com.codefight.java.challenge.ReverseOnDiagonals;
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
public class challengeIT {
    
    public challengeIT() {
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
     * Test of reverseOnDiagonals method, of class challenge.
     */
    @Test
    public void testReverseOnDiagonals() {
        System.out.println("reverseOnDiagonals");
        int[][] matrix = {{1,2,3}, 
 {4,5,6}, 
 {7,8,9}};
        ReverseOnDiagonals instance = new ReverseOnDiagonals();
        int[][] expResult = {{9,2,7}, 
 {4,5,6}, 
 {3,8,1}};
        int[][] result = instance.reverseOnDiagonals(matrix);
        assertArrayEquals(expResult, result);

    }
    
}
