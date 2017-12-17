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
public class SeatsInTheater {
    int seatsInTheater(int nCols, int nRows, int col, int row) {
        int c = nCols-col+1;
        int r = nRows-row;
        return c*r;
    }
    public static void main (String[] args) {
        SeatsInTheater sit = new SeatsInTheater();
        System.out.println("Example1: " + sit.seatsInTheater(16, 11, 5, 3));
        System.out.println("Example2: " + sit.seatsInTheater(13, 6, 8, 3));
        
    }
}
