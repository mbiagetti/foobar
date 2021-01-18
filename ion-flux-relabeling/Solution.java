public class Solution {

    public static int[] solution(int h, int[] q) {
        int x = (int)(Math.pow(2,h)-1);
        System.out.printf("h=%d x=%d\n", h, x);
        int[] out = new int[q.length];
        for (int i = 0; i < q.length; i++) {
            out[i] = getParentNodeValue(q[i],x);
        }

        return out;
    }

    private static int getParentNodeValue(int nodeValue, int maxNodeValue) {
        int current = maxNodeValue;
        int index = maxNodeValue;

        while (current > 0) {
            int lIndex = index - (current + 1) / 2;
            int rIndex = index - 1;
            if (nodeValue == lIndex || nodeValue == rIndex) {
                return index;
            }
            index = (nodeValue < lIndex ? lIndex : rIndex);
            current = (current - 1) / 2;
        }

        return -1;
    }
}