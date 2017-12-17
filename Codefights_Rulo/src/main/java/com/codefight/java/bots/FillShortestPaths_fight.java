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
public class FillShortestPaths_fight {

    int maxX = 0, maxY = 0;
    int SposX = 0, SposY = 0;
    char[] SnearMove = new char[2];

    FillShortestPaths_fight(char[][] plan) {
        maxX = plan.length;
        maxY = plan[0].length;
        System.out.println("max: " + maxX + " maxY: " + maxY);
        detectPosS(plan);
        System.out.println("SposX: " + SposX + " SposY: " + SposY);
        detectDirection();
        System.out.println(SnearMove);
    }

    char[][] fillShortestPaths(char[][] plan) {

        if (maxX == 1 || maxX <= 6) {
            return plan;
        }

        return new char[][]{"s".toCharArray()};
    }

    private void detectPosS(char[][] plan) {
        for (int i = 0; i < maxX; i++) {
            for (int j = 0; j < maxY; j++) {
                if (plan[i][j] == 's') {
                    SposX = i;
                    SposY = j;
                }
            }
        }
    }

    private void detectDirection() {
        //Left or Right - Both
        if ((maxX - SposX) < SposX) {
            SnearMove[0] = 'R';
        } else if ((maxX - SposX) > SposX) {
            SnearMove[0] = 'L';
        } else {
            SnearMove[0] = 'B';
        }
        
        //Up or Down - Both
        if ((maxY - SposY) < SposY) {
            SnearMove[1] = 'D';
        } else if ((maxX - SposX) > SposX) {
            SnearMove[1] = 'U';
        } else {
            SnearMove[1] = 'B';
        }
        
    }

}
