/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.java.interview.strings;

/**
 *
 * @author Rulo
 */
public class AmendTheSentence {

    String amendTheSentence(String s) {
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == Character.toUpperCase(c[i])) {
                if (i!=0) sb.append(" ");
                sb.append(Character.toLowerCase(c[i]));
            } else {
                sb.append(c[i]);
            }

        }
        return sb.toString();
    }

    public static void main (String[] args) {
        AmendTheSentence ats = new AmendTheSentence();
        String s = "vSKwWDjwIerQKMgVaAniorRJlerbKpDgvyKBLPNwSRWtylqKewNFtERNuUBBHAsGkTSSfdhQHJYvAighAdeG";
        System.out.println(ats.amendTheSentence(s));
    }
}
