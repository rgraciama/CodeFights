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
            return reverseFragmentParentheses(s);
        } 
        return s;
    }
    String reverseFragmentParentheses(String s) {
        Pattern patron = Pattern.compile("\\(([^()]*)\\)");
        Matcher encaja = patron.matcher(s);
        int count = 0;
        while(encaja.find()) {
            count++;
            //s = encaja.replaceFirst("-");
            StringBuilder sB = new StringBuilder(encaja.group());
            sB = new StringBuilder(sB.substring(1, sB.length()-1));
            sB.reverse();
            //System.out.println(sB);
            s = encaja.replaceFirst(sB.toString());
            
            //System.out.println(s);
            //System.out.println("found: " + count + " : "
            //        + encaja.start() + " - " + encaja.end());
            encaja = patron.matcher(s);
        }
        return s;
    }
    
    public static void main (String[] args) {
        ReverseParentheses r = new ReverseParentheses();
        System.out.println(r.reverseParentheses("a(bcdefghijkl(mno)p)q"));
    }


}
