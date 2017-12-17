/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.java.challenge;

import com.codefight.java.challenge.landscapingEarnings2;
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
public class landscapingEarnings2IT {
    
    public landscapingEarnings2IT() {
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
     * Test of landscapingEarnings2 method, of class landscapingEarnings2.
     */
    @Test
    public void testLandscapingEarnings2() {
        System.out.println("landscapingEarnings2");
        int time = 20;
        landscapingEarnings2 instance = new landscapingEarnings2();
        String expResult = "raking,raking:14";
        String result = instance.landscapingEarnings2(time);
        assertEquals(expResult, result);
    }
    
}
