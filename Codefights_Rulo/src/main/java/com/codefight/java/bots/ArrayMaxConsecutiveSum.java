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
public class ArrayMaxConsecutiveSum {

    int arrayMaxConsecutiveSum(int[] inputArray, int k) {

        int result = 0,
                currentSum = 0;

        for (int i = 0; i < k - 0; i++) {
            currentSum += inputArray[i];
        }
        System.out.println(currentSum);
        for (int i = k-1; i < inputArray.length; i++) {
            currentSum += inputArray[i];
            if (currentSum > result) {
                result = currentSum;
            }
            System.out.println("B:"+currentSum);
            currentSum -= inputArray[i - k + 1];
            System.out.println(currentSum);
        }

        return result;
    }
    
    public static void main (String[] args) {
        ArrayMaxConsecutiveSum a = new ArrayMaxConsecutiveSum();
        int[] r = {2, 3, 5, 1, 6};
        int k = 2;
        
        a.arrayMaxConsecutiveSum(r, k);
        
        
    }
}
