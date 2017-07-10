/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack3;

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
public class Arcade9IT {

    public Arcade9IT() {
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
     * Test of allLongestStrings method, of class Arcade9.
     */
    @Test
    public void testAllLongestStrings() {
        System.out.println("allLongestStrings");
        String[] inputArray = {"aba",
            "aa",
            "ad",
            "vcd",
            "aba"};
        Arcade9 instance = new Arcade9();
        String[] expResult = {"aba",
            "vcd",
            "aba"};
        String[] result = instance.allLongestStrings(inputArray);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
