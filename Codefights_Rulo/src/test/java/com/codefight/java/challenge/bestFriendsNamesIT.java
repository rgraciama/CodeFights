/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.java.challenge;

import com.codefight.java.challenge.BestFriendsNames;
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
public class bestFriendsNamesIT {
    
    public bestFriendsNamesIT() {
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
     * Test of bestFriendNames method, of class BestFriendsNames.
     */
    @Test
    public void testBestFriendNames() {
        System.out.println("bestFriendNames");
        String n = "Thor";
        String m = "Mulan";
        BestFriendsNames instance = new BestFriendsNames();
        boolean expResult = false;
        boolean result = instance.bestFriendNames(n, m);
        assertEquals(expResult, result);
    }
}
