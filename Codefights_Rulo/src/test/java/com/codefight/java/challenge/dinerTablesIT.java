/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.java.challenge;

import com.codefight.java.challenge.DinerTables;
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
public class dinerTablesIT {
    
    public dinerTablesIT() {
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
     * Test of DinerTables method, of class DinerTables.
     */
    @Test
    public void test1_DinerTables() {
        System.out.println("dinerTables");
        long n = 100L;
        DinerTables instance = new DinerTables();
        int expResult = 5;
        int result = instance.dinerTables(n);
        assertEquals(expResult, result); 
    }
        @Test
    public void test3_DinerTables() {
        System.out.println("dinerTables");
        long n = 1L;
        DinerTables instance = new DinerTables();
        int expResult = 2;
        int result = instance.dinerTables(n);
        assertEquals(expResult, result); 
    }
    
            @Test
    public void test4_DinerTables() {
        System.out.println("dinerTables");
        long n = 4L;
        DinerTables instance = new DinerTables();
        int expResult = 3;
        int result = instance.dinerTables(n);
        assertEquals(expResult, result); 
    }
    
}
