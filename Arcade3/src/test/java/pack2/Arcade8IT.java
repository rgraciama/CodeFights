/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack2;

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
public class Arcade8IT {

    public Arcade8IT() {
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
     * Test of matrixElementsSum method, of class Arcade8.
     */
    @Test
    public void testMatrixElementsSum() {
        System.out.println("matrixElementsSum");
        int[][] matrix = {{0, 1, 1, 2},
        {0, 5, 0, 0},
        {2, 0, 3, 3}};
        Arcade8 a = new Arcade8();
        int expResult = 9;
        int result = a.matrixElementsSum(matrix);
        assertEquals(expResult, result);
    }

}
