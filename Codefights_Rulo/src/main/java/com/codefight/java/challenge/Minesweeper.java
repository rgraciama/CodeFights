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
public class Minesweeper {

    int[][] minesweeper(boolean[][] m) {

        int[][] n = new int[m.length][m[0].length];
        
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                if (m[i][j]==true) {
                    //n[i][j]++;
                    if (j>0) n[i][j-1]++;
                    if (j<m[0].length-1) n[i][j+1]++;
                    //arriba
                    if (i>0) {
                        n[i-1][j]++;
                        if (j>0) n[i-1][j-1]++;
                        if (j<m[0].length-1) n[i-1][j+1]++;
                    }
                    if (i<m.length-1) {
                        n[i+1][j]++;
                        if (j>0) n[i+1][j-1]++;
                        if (j<m[0].length-1) n[i+1][j+1]++;
                    }

                }
            }
        }
        return n;

    }
    
    public static void main (String[] args) {
        boolean[][] test = {{true,false,false,true}, 
            {false,false,true,false}, 
            {true,true,false,true}};
        
        Minesweeper mine = new Minesweeper();
        
        System.out.println(mine.minesweeper(test).toString());
    }
}
