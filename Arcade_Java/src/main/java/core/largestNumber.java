/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author Rulo
 */
public class largestNumber {

    int largestNumber(int n) {
        
        char first = '9';
        String res = "";
        for (int i = 0; i < n; i++) {
            res+=first;
        }
        return Integer.parseInt(res);
    }

}