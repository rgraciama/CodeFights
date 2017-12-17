/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.java.bots;

/**
 *
 * @author Rulo
 */
public class FirstDigit {
    char firstDigit(String iS) {
        
        char[] cS = iS.toCharArray();
        for (char c : cS) {
            if (Character.isDigit(c)) return c;
        }
        return '0';
    }
    
    public static void main (String[] args) {
        FirstDigit fD = new FirstDigit();
        String s = "var_1__Int";
        
        System.out.println(fD.firstDigit(s));
        
    }
}
