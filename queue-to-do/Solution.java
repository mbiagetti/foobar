public class Solution {
    public static int solution(int start, int length) {
        int originLength = length;
        int arrLength = (length * (length + 1)) / 2;
        int[] el = new int[arrLength];
        int idx = 0;

        while (length > 0) {
//            System.out.print("length ");
  //          System.out.println(length);
            for (int i = 0; i < length; i++) {
                int x = start++;
    //            System.out.println(x);
                el[idx++] = x;
            }
            for (int j = 0; j < originLength - length; j++) {
                start++;

            }
            length--;
        }
        return xorOfArray(el, arrLength);
    }

    static int xorOfArray(int[] arr, int n) {
        int xor_arr = 0;
        for (int i = 0; i < n; i++) {
            xor_arr = xor_arr ^ arr[i];
        }
        return xor_arr;
    }
}