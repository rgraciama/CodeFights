package pack2;

import java.util.Arrays;

/**
 *
 * @author Rulo
 */
public class Arcade3 {

    boolean almostIncreasingSequence(int[] sequence) {
        int[] result = new int[sequence.length];
        System.arraycopy(sequence, 0, result, 0, sequence.length);

        boolean isIncremental = false;
        int i = 0;
        while (!isIncremental && (i < sequence.length)) {
            result[i] = 0;
            System.out.println(Arrays.toString(result));
            isIncremental = incrementalArray(result);
            System.out.println(i + " : i " + isIncremental);
            i++;
            System.arraycopy(sequence, 0, result, 0, sequence.length);
        }
        return isIncremental;
    }

    boolean incrementalArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] == 0 && i > 1) {
                return array[i - 1] > array[i + 1];
            } else if (array[i] != 0 && array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }
}
