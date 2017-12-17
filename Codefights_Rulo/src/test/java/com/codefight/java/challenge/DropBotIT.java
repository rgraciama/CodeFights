/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.java.challenge;

import com.codefight.java.challenge.DropBot;
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
public class DropBotIT {
    
    public DropBotIT() {
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
     * Test of losslessDataCompression method, of class DropBot.
     */
    @Test
    public void testLosslessDataCompression() {
        System.out.println("losslessDataCompression");
        String inputString = "abacabadabacaba";
        int width = 7;
        DropBot instance = new DropBot();
        String expResult = "ab(0,1)c(0,3)d(4,3)c(8,3)";
        String result = instance.losslessDataCompression(inputString, width);
        assertEquals(expResult, result);
       
    }
    
}
