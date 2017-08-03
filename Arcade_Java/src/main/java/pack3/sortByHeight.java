/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack3;

import java.util.Arrays;

/**
 *
 * @author Rulo
 */
public class sortByHeight {

    int[] sortByHeight(int[] a) {
        int len1 = a.length, len2 = len1;
        int[] r = Arrays.copyOf(a, len2);
        Arrays.sort(a);
        int posA = 0, posR = 0;
        posA = isNextValueOfArray(posA, a);
        if (posA != -1) {
            posR = isNextValueOfArray(posR, r);
            r[posR] = a[posA];
        } else {
            return r;
        }
        while (posA >= 0 && posR >= 0) {
            posA = isNextValueOfArray(posA+1, a);
            if (posA != -1 && posA < len1) {
                posR = isNextValueOfArray(posR+1, r);
                r[posR] = a[posA];
            }
        }
        return r;
    }

    int isNextValueOfArray(int p, int[] a) {

        int nPos = -1;
        while (p < a.length && nPos == -1) {
            if (a[p] < 0) {
                p++;
            } else {
                nPos = p;
            }
        }
        return nPos;
    }
}
