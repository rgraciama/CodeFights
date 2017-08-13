/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Rulo
 */
public class reverseParentheses {

    String reverseParentheses(String s) {
        if (s.contains("(")) {
            return reverseFragmentParentheses(s);
        } 
        return s;
    }
    String reverseFragmentParentheses(String s) {
        Pattern patron = Pattern.compile("/\\(([^()]*)\\)/i");
        Matcher encaja = patron.matcher(s);
        StringBuilder r = new StringBuilder(encaja).reverse().toString();
        return r;
    }
}
