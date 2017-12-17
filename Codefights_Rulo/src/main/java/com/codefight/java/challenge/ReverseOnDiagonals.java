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
public class ReverseOnDiagonals {

    int[][] reverseOnDiagonals(int[][] matrix) {
        int i = matrix.length-1;
        int j = matrix[0].length-1;
        int[][] matrix2 = matrix;
        
        matrix2[0][0] = matrix[i][j];
        matrix2[0][i] = matrix[i][0];
        return matrix2;
}

}
