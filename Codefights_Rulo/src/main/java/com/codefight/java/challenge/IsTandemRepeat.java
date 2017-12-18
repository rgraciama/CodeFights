/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.java.challenge;

/**
 *
 * @author Rulo
 */
public class IsTandemRepeat {

    boolean isTandemRepeat(String inputString) {
        if (inputString.length() % 2 != 0) {
            return false;
        } else {
            String fir = inputString.substring(0, inputString.length()/2);
            String sec = inputString.substring(inputString.length()/2, inputString.length());
            String res = fir+sec;
            System.out.println(res);
            if (res.equals(inputString)) return true;
        }
        return false;
    }
    
    public static void main (String[] args) {
        
    }
}
