/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

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
public class Interview2IT {
    
    public Interview2IT() {
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
     * Test of firstNotRepeatingCharacter method, of class Interview2.
     */
    @Test
    public void test1_FirstNotRepeatingCharacter() {
        System.out.println("1.firstNotRepeatingCharacter");
        String s = "abacabad";
        Interview2 instance = new Interview2();
        char expResult = 'c';
        char result = instance.firstNotRepeatingCharacter(s);
        assertEquals(expResult, result);
    }
    
}
