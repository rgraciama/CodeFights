/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.challenge;

/**
 *
 * @author Rulo
 */
public class dinerTables {

    int dinerTables(long n) {
        int count = 2;
        if (n == 0) {
            return 1;
        }
        while (n > count) {
            n = n / count;
            count++;
        }
        return (int) count;
    }

}
