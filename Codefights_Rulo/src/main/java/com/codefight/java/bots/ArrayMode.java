/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.java.bots;

import java.util.ArrayList;

/**
 *
 * @author Rulo
 */
public class ArrayMode {

    int arrayMode(int[] sequence) {
        ArrayList<Integer> c = new ArrayList<Integer>();
        int r = 0;
        for (int i = 0; i <= 10; i++) {
            c.add(0);
        }
        for (int j = 0; j < sequence.length; j++) {
            c.set(sequence[j], c.get(sequence[j]) + 1);
            if (c.get(sequence[j]) > c.get(r)) {
                r = sequence[j];
            }
        }
        return r;
    }

    public static void main(String[] args) {
        ArrayMode a = new ArrayMode();
        int[] s = {1,3,2,1};
        
        System.out.println(a.arrayMode(s));
        
        
    }
}
