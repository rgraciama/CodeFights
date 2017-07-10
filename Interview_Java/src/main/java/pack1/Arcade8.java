/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack2;

/**
 *
 * @author Rulo
 */
public class Arcade8 {
    int matrixElementsSum(int[][] matrix) {
        int count = 0;
        boolean isOk =true;
        for (int j = 0; j < matrix[0].length; j++) {
            int i = 0;
            isOk = true;
            while(i<matrix.length && isOk) {
                count += matrix[i][j];
                if (matrix[i][j]==0) isOk=false;
                i++;
            } 
        }
        return count;
    }
}
