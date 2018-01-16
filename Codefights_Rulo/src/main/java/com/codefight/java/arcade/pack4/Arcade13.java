/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.java.arcade.pack4;

/**
 *
 * @author Rulo
 */
public class Arcade13 {
    public static void main (String[] args) {
        
        String[] r = {"abc", "ded"};
        
        Arcade13 a = new Arcade13();
        printArray(a.addBorder(r));
    }
    String[] addBorder(String[] p) {
        String[] s = new String[p.length+2];
        s[0] = fillWithAsterisk(p[0].length()+2);
        s[p.length+1] = s[0];
        for (int j = 1; j < s.length-1; j++) {
            s[j] = '*'+p[j-1]+'*';
        }
        
        return s;
    }
    
    String fillWithAsterisk(int n) {
        String e = "";
        for (int i = 0; i < n; i++) {
            e+= '*';
        }
        return e;
    }
    static void printArray(String[] s) {
        for (String str : s) {
            System.out.println(str);
        }
    }
}
