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
public class LossLessDataCompression {

    String losslessDataCompression(String iS, int width) {
        String window = iS.substring(0, width+1);
        //String window2 = iS.substring(width+1, iS.length()-1);
        
        String r = "";
        for (int i = 0; i < width; i++) {
            int cInString;
            cInString = r.indexOf(window.charAt(i));
            if (cInString<0) {
                r+=iS.charAt(i);
            } else {
                r+="("+0+","+(cInString+1)+")";
            }
        }
        int i = width+1;
        for(int j = width+1; j < iS.length(); j++) {
            int cInString;
            cInString = r.indexOf(iS.charAt(j));
            if (cInString<0) {
                r+=iS.charAt(j);
            } else {
                r+="("+i+","+cInString+")";
            }
        }
        System.out.println(r);
        return r;
    }
}
