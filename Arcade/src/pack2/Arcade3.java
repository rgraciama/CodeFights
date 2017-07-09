/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack2;

import java.util.Arrays;

/**
 *
 * @author Rulo
 */
public class Arcade3 {

    /**
     * @param args the command line arguments
     */
    boolean almostIncreasingSequence(int[] sequence) {
        int[] result = sequence;
        boolean isIncremental = true;
        int i = 0;
        while (isIncremental && (i < sequence.length)) {
            result[i] = 0;
            System.out.println(Arrays.toString(result));
            isIncremental = incrementalArray(result);
            System.out.println(i + " : i " + isIncremental);
            i++;
            result = sequence;
        }
        return isIncremental;
    }

    boolean incrementalArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] != 0 && array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
        Arcade3 a = new Arcade3();
        System.out.println(a.almostIncreasingSequence(arr));
    }

}
