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
public class MyConcat {
    String myConcat(String[] arguments, String separator) {
        String r = "";
        for (int i = 0; i < arguments.length; i++) {
            r+=arguments[i]+separator;
        }
        
        return r;
    }
}
