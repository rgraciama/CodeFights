/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.java.interview.common;

/**
 *
 * @author Rulo
 */
public class ContainsDuplicates {
    boolean containsDuplicates(int[] a) {
        boolean[] b = new boolean[9];
        for (int i = 0; i < a.length; i++) {
            if (b[a[i]]) return true;
            b[a[i]] = true;
        }
        return false;
    }
}
