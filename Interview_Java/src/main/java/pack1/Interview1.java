package pack1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Rulo
 */
public class Interview1 {

    int firstDuplicate(int[] a) {
        //Arrays.sort(a);
        if (a.length==1) return -1;
        int i = 1;
        if (a[i-1]==a[i]) return a[i];
        else i++;
        while (i<a.length) {
            int j = i-1;
            while (a[i]!=a[j] && j>0) {
                j--;
            }
            if (a[i]==a[j]) return a[i];
            i++;
        }
        return -1;
    }

}
