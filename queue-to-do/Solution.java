public class Solution {
    public static int solution(int start, int length) {
        int out = xor(start + 2 * (length - 1));
        out ^= xor(start - 1);

        for (int i = 0; i < (length - 2); i++) {
            int elems = length - 2 - i;
            int el = start + length * (2 + i) - 1;
            out ^= xor(el + elems) ^ xor(el);
        }
        return out;
    }

    private static int xor(int n) {
        switch (n % 4) {
            case 0:
                return n;
            case 1:
                return 1;
            case 2:
                return n + 1;
        }

        return 0;
    }
}