/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.java.challenge;

import com.codefight.java.challenge.LossLessDataCompression;
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
public class challenge3IT {
    
    public challenge3IT() {
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
     * Test of losslessDataCompression method, of class LossLessDataCompression.
     */
    @Test
    public void testLosslessDataCompression() {
        System.out.println("losslessDataCompression");
        String inputString = "abacabadabacaba";
        int width = 7;
        LossLessDataCompression instance = new LossLessDataCompression();
        String expResult = "abacabad";
        String result = instance.losslessDataCompression(inputString, width);
        assertEquals(expResult, result);
        
    }
    
}
