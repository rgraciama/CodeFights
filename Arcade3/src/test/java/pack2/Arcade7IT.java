/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack2;

import java.util.Arrays;
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
public class Arcade7IT {

    Arcade7 a = new Arcade7();

    public Arcade7IT() {

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
     * Test of almostIncreasingSequence method, of class Arcade7.
     */
    @org.junit.Test
    public void test22_AlmostIncreasingSequence() {
        int[] sequence = {5384, 12, 34, 54, 48};
        boolean expResult = false;

        System.out.println("22.almostIncreasingSequence test:" + Arrays.toString(sequence));

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }    
    
    @org.junit.Test
    public void test01_AlmostIncreasingSequence() {
        int[] sequence = {1, 3, 2, 1};
        boolean expResult = false;
        
        System.out.println("1.almostIncreasingSequence test:" + Arrays.toString(sequence));

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void test02_AlmostIncreasingSequence() {
        int[] sequence = {1, 3, 2};
        boolean expResult = true;

        System.out.println("2.almostIncreasingSequence test:" + Arrays.toString(sequence)+ " exp:" +expResult);

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void test03_AlmostIncreasingSequence() {
        int[] sequence = {1, 2, 1, 2};
        boolean expResult = false;

        System.out.println("3.almostIncreasingSequence test:" + Arrays.toString(sequence) + " exp:" +expResult);

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void test04_AlmostIncreasingSequence() {
        int[] sequence = {1, 4, 10, 4, 2};
        boolean expResult = false;

        System.out.println("4.almostIncreasingSequence test:" + Arrays.toString(sequence)+ " exp:" +expResult);

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void test05_AlmostIncreasingSequence() {
        int[] sequence = {10, 1, 2, 3, 4, 5};
        boolean expResult = true;

        System.out.println("5.almostIncreasingSequence test:" + Arrays.toString(sequence)+ " exp:" +expResult);

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }
    
    @org.junit.Test
    public void test06_AlmostIncreasingSequence() {
        int[] sequence = {1, 1, 1, 2, 3};
        boolean expResult = false;

        System.out.println("6.almostIncreasingSequence test:" + Arrays.toString(sequence)+ " exp:" +expResult);

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }
    
        @org.junit.Test
    public void test07_AlmostIncreasingSequence() {
        int[] sequence = {0, -2, 5, 6};
        boolean expResult = true;

        System.out.println("7.almostIncreasingSequence test:" + Arrays.toString(sequence)+ " exp:" +expResult);

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }
    
            @org.junit.Test
    public void test08_AlmostIncreasingSequence() {
        int[] sequence = {1, 2, 3, 4, 5, 3, 5, 6};
        boolean expResult = false;

        System.out.println("8.almostIncreasingSequence test:" + Arrays.toString(sequence)+ " exp:" +expResult);

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }
    
            @org.junit.Test
    public void test12_AlmostIncreasingSequence() {
        int[] sequence = {1, 2, 3, 4, 3, 6};
        boolean expResult = true;

        System.out.println("12.almostIncreasingSequence test:" + Arrays.toString(sequence)+ " exp:" +expResult);

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }    
    
                @org.junit.Test
    public void test15_AlmostIncreasingSequence() {
        int[] sequence = {3, 5, 67, 98, 3};
        boolean expResult = true;

        System.out.println("15.almostIncreasingSequence test:" + Arrays.toString(sequence)+ " exp:" +expResult);

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }
                    
    @org.junit.Test
    public void test10_AlmostIncreasingSequence() {
        int[] sequence = {1,1};
        boolean expResult = true;

        System.out.println("15.almostIncreasingSequence test:" + Arrays.toString(sequence)+ " exp:" +expResult);

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testExtra1_AlmostIncreasingSequence() {
        int[] sequence = {1,0};
        boolean expResult = true;

        System.out.println("15.almostIncreasingSequence test:" + Arrays.toString(sequence)+ " exp:" +expResult);

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }
    
    
    @org.junit.Test
    public void test16_AlmostIncreasingSequence() {
        int[] sequence = {999, -987, -983, -972, -966, -934, -924, -917, -900, -898, -887, -879, -874, -867, -842, -804, -762, -729, -712, -703, -688, -677, -663, -661, -650, -628, -619, -610, -607, -599, -581, -578, -494, -488, -487, -477, -468, -461, -432, -381, -377, -376, -339, -330, -329, -304, -292, -291, -277, -257, -256, -242, -236, -235, -220, -137, -100, -46, -33, -17, -3, -2, 6, 35, 110, 124, 127, 130, 186, 214, 236, 255, 301, 311, 322, 348, 355, 374, 375, 384, 391, 392, 400, 410, 437, 487, 520, 572, 603, 627, 644, 657, 666, 676, 714, 750, 897, 898, 950, 972, 995};
        boolean expResult = true;

        System.out.println("16.almostIncreasingSequence test:" + Arrays.toString(sequence)+ " exp:" +expResult);

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }
    
    @org.junit.Test
    public void test17_AlmostIncreasingSequence() {
        int[] sequence = {-997, -978, -975, -968, -959, -956, -907, -872, -871, -858, -836, -827, -823, -794, -786, -771, -740, -728, -716, -711, -697, -660, -659, -638, -633, -607, -601, -597, -573, -562, -548, -536, -517, -500, -433, -402, -387, -384, -301, -291, -283, -270, -252, -240, -230, -221, -215, -202, -200, -185, -171, -73, -47, -38, -34, -17, -3, 8, 42, 56, 65, 133, 140, 146, 180, 192, 201, 233, 241, 256, 285, 302, 320, 353, 324, 420, 428, 429, 442, 470, 487, 542, 547, 561, 564, 664, 666, 670, 693, 738, 793, 824, 845, 848, 864, 929, 931, 952, 985, 997, 1};
        boolean expResult = false;

        System.out.println("17.almostIncreasingSequence test:" + Arrays.toString(sequence)+ " exp:" +expResult);

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }    

    @org.junit.Test
    public void test18_AlmostIncreasingSequence() {
        int[] sequence = {1, 2, 3, 1};
        boolean expResult = true;

        System.out.println("18.almostIncreasingSequence test:" + Arrays.toString(sequence));

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }
    
    @org.junit.Test
    public void test19_AlmostIncreasingSequence() {
        int[] sequence = {3, 4, 5, 10, 20, 10, 20, 30};
        boolean expResult = false;

        System.out.println("19.almostIncreasingSequence test:" + Arrays.toString(sequence));

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void test20_AlmostIncreasingSequence() {
        int[] sequence = {5, 5, 5};
        boolean expResult = false;

        System.out.println("20.almostIncreasingSequence test:" + Arrays.toString(sequence));

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }   

    @org.junit.Test
    public void test21_AlmostIncreasingSequence() {
        int[] sequence = {-5, -4, -3, -2, 10, 2, 8};
        boolean expResult = true;

        System.out.println("21.almostIncreasingSequence test:" + Arrays.toString(sequence));

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }   
    


    @org.junit.Test
    public void test23_AlmostIncreasingSequence() {
        int[] sequence = {1, 4, 5, 2, 3};
        boolean expResult = false;

        System.out.println("23.almostIncreasingSequence test:" + Arrays.toString(sequence));

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void test24_AlmostIncreasingSequence() {
        int[] sequence = {1, 2, 3, 4, 5, 1, 2, 3, 4};
        boolean expResult = false;

        System.out.println("24.almostIncreasingSequence test:" + Arrays.toString(sequence));

        boolean result = a.almostIncreasingSequence(sequence);
        assertEquals(expResult, result);
    }     
}
