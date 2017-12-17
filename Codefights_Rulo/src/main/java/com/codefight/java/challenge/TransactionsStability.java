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
public class TransactionsStability {
    double transactionsStability(int[] t) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if (t.length == 1) return t[0];
        
        for (int i = 0; i < t.length; i++) {
            if (max < t[i]) max=t[i];
            if (min > t[i]) min=t[i];
        }
        if (max == min) return 1;
        return (double)min/((double)max/2);
    }
    
    public static void main (String[] args) {
        TransactionsStability t = new TransactionsStability();
        int[] a = {1,2,3};
        
        System.out.println(t.transactionsStability(a));
    }
}
