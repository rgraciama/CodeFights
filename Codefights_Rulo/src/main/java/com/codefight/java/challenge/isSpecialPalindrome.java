/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.java.challenge;

import java.io.Console;

/**
 *
 * @author Rulo
 */
public class isSpecialPalindrome {

    boolean isSpecialPalindrome(int n) {
        
        String r = Integer.toBinaryString(n);
        boolean isZero = false, isPal = false;
        if (!r.contains("0")) return false;
        for (int i = 0; i < r.length(); i++) {
            if (r.charAt(i)=='0') {
                if (!isZero) isZero = true;
                else return false;
            }
            if (r.charAt(i)=='1') isPal = true;
        }
        return isPal && r.equals(new StringBuilder(r).reverse().toString());
    }
}
