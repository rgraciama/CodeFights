/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author Rulo
 */
public class Interview2 {

    char firstNotRepeatingCharacter(String s) {
        if (s.length() == 1) {
            return s.charAt(0);
        }
        int mid = s.length() / 2, ini = 0;
        int i = 0;
        String sTextoBuscado = "";
        int contador = 0;
//        while (s.matches(s.substring(0,mid-1))) {
//            
//        }

        while (s.indexOf(s.substring(ini,mid-1)) > -1) {
            s = s.substring(s.indexOf(sTextoBuscado) + sTextoBuscado.length(), s.length());
            contador++;
        }
        return 'z';
    }

}
