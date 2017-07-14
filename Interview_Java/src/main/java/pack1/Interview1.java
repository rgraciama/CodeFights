package pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author Rulo
 */
public class Interview1 {

    int firstDuplicate(int[] a) {
        //Dado un array donde los valores de este no seran mayores que su lentgh
        //Recorres el array, pero buscas su posicion y lo marcas con un -
        //Entonces cuando vuelva a salir el mismo detectara el valor negativo
        //Y BooOom!
        for (int i : a) {
            if (a[Math.abs(i) - 1] < 0) {
                return Math.abs(i);
            }
            a[Math.abs(i) - 1] *= -1;
        }
        return -1;

    }
}
