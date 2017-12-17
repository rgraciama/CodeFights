/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.java.challenge;

import com.codefight.java.challenge.isSpecialPalindrome;
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
public class isSpecialPalindromeIT {
    
    public isSpecialPalindromeIT() {
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
     * Test of isSpecialPalindrome method, of class isSpecialPalindrome.
     */
    @Test
    public void testIsSpecialPalindrome() {
        System.out.println("isSpecialPalindrome");
        int n = 5;
        isSpecialPalindrome instance = new isSpecialPalindrome();
        boolean expResult = true;
        boolean result = instance.isSpecialPalindrome(n);
        assertEquals(expResult, result);
        
    }
        @Test
    public void test2_IsSpecialPalindrome() {
        System.out.println("isSpecialPalindrome");
        int n = 0;
        isSpecialPalindrome instance = new isSpecialPalindrome();
        boolean expResult = false;
        boolean result = instance.isSpecialPalindrome(n);
        assertEquals(expResult, result);
        
    }
            @Test
    public void test3_IsSpecialPalindrome() {
        System.out.println("isSpecialPalindrome n=7");
        int n = 7;
        isSpecialPalindrome instance = new isSpecialPalindrome();
        boolean expResult = false;
        boolean result = instance.isSpecialPalindrome(n);
        assertEquals(expResult, result);
        
    }
    
                @Test
    public void test5_IsSpecialPalindrome() {
        System.out.println("isSpecialPalindrome n=9");
        int n = 9;
        isSpecialPalindrome instance = new isSpecialPalindrome();
        boolean expResult = false;
        boolean result = instance.isSpecialPalindrome(n);
        assertEquals(expResult, result);
        
    }
                    @Test
    public void test15_IsSpecialPalindrome() {
        System.out.println("isSpecialPalindrome n=23");
        int n = 23;
        isSpecialPalindrome instance = new isSpecialPalindrome();
        boolean expResult = false;
        boolean result = instance.isSpecialPalindrome(n);
        assertEquals(expResult, result);
        
    }
    
}
