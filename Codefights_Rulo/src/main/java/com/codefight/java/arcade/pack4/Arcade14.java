/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.java.arcade.pack4;

import java.util.Arrays;

/**
 *
 * @author Rulo
 */
public class Arcade14 {

    boolean areSimilar(int[] a, int[] b) {
        int aux = -1, aux2 = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                if (aux == -1) {
                    aux = i;
                } else if (aux2 == -1) {
                    aux2 = i;
                } else {
                    return false;
                }
            }
        }
        if (aux != -1) {
            if (aux2 == -1) {
                return false;
            } else {
                if (a[aux2] != b[aux] || a[aux] != b[aux2]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Arcade14 a14 = new Arcade14();

        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3};

        System.out.println(a14.areSimilar(a1, a2));
    }
}
