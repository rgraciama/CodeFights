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
public class TelephoneGameClass {

    int telephoneGame(String[] messages) {
        String first = messages[0];
        for (int i = 1; i < messages.length; i++) {
            if (!first.equals(messages[i])) {
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        String messages[] = {"CodeFights rocks!",
            "CodeFights rocks!",
            "CodeFights folks!",
            "Code Fights folks!",
            "Code bites folks!"};

       TelephoneGameClass t = new TelephoneGameClass();
       
       
        
        System.out.println(t.telephoneGame(messages));
    }
}
