/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack3;

/**
 *
 * @author Rulo
 */
public class Arcade10 {

    int commonCharacterCount(String s1, String s2) {
        int n = 0;
        int l = s1.length();

        for (int i = 0; i < l; i++) {
            int p;
                p = s2.indexOf(s1.charAt(i));
            if (p != -1) {
                n++;
                if (p == 0) {
                    s2 = s2.substring(p + 1, s2.length());
                } else if (p == s2.length() - 1) {
                    s2 = s2.substring(0, p);
                } else {
                    s2 = s2.substring(0, p) + s2.substring(p + 1, s2.length());
                }
            }
        }
        return n;
    }
}
