package pack2;

import java.util.Arrays;

/**
 *
 * @author Rulo
 */
public class Arcade7 {
    boolean almostIncreasingSequence(int[] arr) {
        int cont = 0;
        boolean life = true, next=false;
        if (arr.length == 2) {
            return true;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i] && !next) {
                cont++;
            } else {
                if (i>1) {
                    if (arr[i - 2] < arr[i]) {
                        cont++;
                        if (!life && !next) return false;
                        life=false;
                    }
                    else if (life) {
                        life = false;
                        next = !next;
                    } else {
                        return false;
                    }
                } else {
                    life=false;
                }
            }
        }
        return (cont >= arr.length - 2) ? true : false;
    }
}
