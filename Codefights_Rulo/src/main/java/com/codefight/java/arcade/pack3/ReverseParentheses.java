/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.java.arcade.pack3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Rulo
 */
public class ReverseParentheses {

    String reverseParentheses(String s) {
        if (s.contains("(")) {
            return reverseFragmentParentheses2(s);
        } 
        return s;
    }
    String reverseFragmentParentheses(String s) {
        Pattern patron = Pattern.compile("/\\(([^()]*)\\)/i");
        Matcher encaja = patron.matcher(s);
        int count = 0;
        while(encaja.find()) {
            count++;
            System.out.println("found: " + count + " : "
                    + encaja.start() + " - " + encaja.end());
        }
        return "Hola";
    }
    
    public static void main (String[] args) {
        ReverseParentheses r = new ReverseParentheses();
        r.reverseParentheses("a(bcdefghijkl(mno)p)q");
    }

    private String reverseFragmentParentheses2(String s) {
        System.out.println(s.matches("/\\(([^()]*)\\)/i"));
        return "hola";
    }
}
