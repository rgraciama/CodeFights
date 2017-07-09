package pack2;

import java.util.Arrays;

/**
 *
 * @author Rulo
 */
public class Arcade3 {

    boolean almostIncreasingSequence(int[] sequence) {
        System.out.println("Seq: "+ Arrays.toString(sequence));
        
        int[] result = new int[sequence.length-1];
       
        System.arraycopy(sequence, 1, result, 0, result.length);
        System.out.println(Arrays.toString(result));
        
        boolean isIncremental = incrementalArray(result);
        System.out.println("Primer check: "+isIncremental);
        int i = 1;
        while (!isIncremental && i<=result.length) {
            System.arraycopy(sequence, 0, result, 0, i);
            //System.out.println("Part1: "+ Arrays.toString(result));
            System.arraycopy(sequence, i+1, result, i, result.length-i);
            System.out.println("Result: "+ Arrays.toString(result));
            isIncremental = incrementalArray(result);
            System.out.println(i +" check: "+isIncremental);
            i++;
        }
        return isIncremental;
    }

    boolean incrementalArray(int[] arr) {
        boolean isOk = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]>=arr[i]) return false;
        }
        return isOk;
    }
}
