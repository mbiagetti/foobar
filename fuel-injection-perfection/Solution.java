import java.math.BigInteger;

import static java.math.BigInteger.ONE;

public class Solution {
    private static final BigInteger THREE = BigInteger.valueOf(3L);

    public static int solution(String numStr) {
        BigInteger num = new BigInteger(numStr);

        int ops = 0;

        while (!num.equals(ONE)) {
            if (!num.testBit(0)) {
                num = num.shiftRight(1);
            }
            else if (num.equals(THREE))
            {
                num = num.subtract(ONE);
            }
            else {
                BigInteger numIncrement = num.add(ONE);
                BigInteger numDecrement = num.subtract(ONE);
                num = numIncrement.getLowestSetBit() > numDecrement.getLowestSetBit() ? numIncrement : numDecrement;
            }
            ops++;
        }
        return ops;
    }
}