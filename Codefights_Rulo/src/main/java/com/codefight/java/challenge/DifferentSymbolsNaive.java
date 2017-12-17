/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.java.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Rulo
 */
public class DifferentSymbolsNaive {
    int differentSymbolsNaive(String s) {
        int numDifChars = 0;
        char[] lString = s.toCharArray();
        ArrayList<Character> lDiffChar = new ArrayList<Character>();
        for (char c:lString) {
            lDiffChar.add(c);
        }
        Collections.sort(lDiffChar);
        char prev = ' ';
        for (char c : lDiffChar) {
            if (prev != c) numDifChars++;
            prev = c;
        }
        return numDifChars;
    }
    
    public static void main (String[] args) {
        DifferentSymbolsNaive dsn = new DifferentSymbolsNaive();
        String s = "cabca";
        System.out.println(dsn.differentSymbolsNaive(s));
    }
}
