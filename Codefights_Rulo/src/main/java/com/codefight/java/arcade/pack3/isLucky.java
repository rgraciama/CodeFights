/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.java.arcade.pack3;

/**
 *
 * @author Rulo
 */
public class isLucky {

    boolean isLucky(int n) {
        String s = Integer.toString(n);
        int l = s.length();
        int cL = 0, cF = 0;
        for (int i = 0,j = l-1; i<l/2; i++, j--) {
            cL += Integer.valueOf(s.charAt(i));
            cF += Integer.valueOf(s.charAt(j));
        }
        if (cL == cF) return true;
                else return false;
    }

}
