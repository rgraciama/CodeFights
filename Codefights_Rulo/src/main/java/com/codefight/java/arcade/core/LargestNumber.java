/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.java.arcade.core;

/**
 *
 * @author Rulo
 */
public class LargestNumber {

    int largestNumber(int n) {
        
        char first = '9';
        String res = "";
        for (int i = 0; i < n; i++) {
            res+=first;
        }
        return Integer.parseInt(res);
    }

}