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
public class DropBot {

	String losslessDataCompression(String iS, int width) {
		String w = "";
                int cont = 0;
		for (int i = 0; i < iS.length(); i++) {
                    
			char ch = iS.charAt(i);
			if (!w.contains("" + iS.charAt(i))) {
				w += ch;
                                cont = 0;
			} else {
                                
				String s = "";
				if (i > width && ((i+width) < iS.length())) {
					s = iS.substring(i - width, i + width);
				} else {
					s = iS.substring(0, i - 1);
				}
				if (s.contains("" + ch)) {
					w += "("+cont+"," + (i - 1) + ")";
                                        cont++;
				} else {
					int f = iS.indexOf(ch);
					if (f > -1) {
						w += "(" + f + "," + 1 + ")";
					}
                                        cont = 0;
				}
			}
		}
		return w;
	}
}
