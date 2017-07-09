/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rulo
 */
public class Arcade9 {

    String[] allLongestStrings(String[] inputArray) {
        int max = 0;
        for (String elem : inputArray) {
            if (max < elem.length()) {
                max = elem.length();
            }
        }
        List<String> ar = new ArrayList<String>();
        for (String elem : inputArray) {
            if (max == elem.length()) {
                ar.add(elem);
            }
        }
        String[] stringArray = ar.toArray(new String[ar.size()]);
        return stringArray;
    }
}
