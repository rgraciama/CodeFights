/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.bots_java;

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
public class fillShortestPaths_fightIT {

    public fillShortestPaths_fightIT() {
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

        @Test
    public void test1_FillShortestPaths() {
        System.out.println("fillShortestPaths");
        char[][] plan = {{' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', 's', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' '}};
        fillShortestPaths_fight instance = new fillShortestPaths_fight();
        char[][] expResult = {{'s'}};
        char[][] result = instance.fillShortestPaths(plan);
        assertArrayEquals(expResult, result);

    }
    
    /**
     * Test of fillShortestPaths method, of class fillShortestPaths_fight.
     */
    @Test
    public void test3_FillShortestPaths() {
        System.out.println("fillShortestPaths");
        char[][] plan = {{'s'}};
        fillShortestPaths_fight instance = new fillShortestPaths_fight();
        char[][] expResult = {{'s'}};
        char[][] result = instance.fillShortestPaths(plan);
        assertArrayEquals(expResult, result);

    }


}
