import java.util.Arrays;

public class Solution {

    public static int solution(int[] l) {
        int x = doSolution(l);
        if (x > 0) return x;

        for (int i = l.length; i > 0 ; i--) {
            x = checkArray(Arrays.copyOfRange(l,0,i));
            if (x > 0) return x;
        }

        return x;
    }

    private static int checkArray(int[] l) {
        int x = 0;
        for (int i = 0; i < l.length; i++) {
            int y = doSolution(removeElement(l,i));
            if (y > x) {
                x = y;
            }
        }

        return x;
    }

    // Sum the digits. The result must be divisible by 3.
    private static int doSolution(int[] l) {
        sortArray(l);
        int x = Integer.parseInt(toString(l));
        if (x % 3 == 0) return x;
        return 0;
    }

    private static String toString(int[] l) {
        int iMax = l.length - 1;
        if (iMax == -1)
            return "0";
        StringBuilder b = new StringBuilder();
        for (int i = 0; ; i++) {
            b.append(l[i]);
            if (i == iMax)
                return b.toString();
        }
    }

    private static void sortArray(int[] array)
    {
        int n = array.length;
        for (int i = 1; i < n; i++)
        {
            int j = i;
            int a = array[i];
            while ((j > 0) && (array[j-1] < a))
            {
                array[j] = array[j-1];
                j--;
            }
            array[j] = a;
        }
    }

    public static int[] removeElement( int [] arr, int index ){
        int[] arrOut = new int[arr.length - 1];
        int remainingElements = arr.length - ( index + 1 );
        System.arraycopy(arr, 0, arrOut, 0, index);
        System.arraycopy(arr, index + 1, arrOut, index, remainingElements);
        return arrOut;
    }
}
