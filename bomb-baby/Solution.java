import java.math.BigInteger;

public class Solution {
    public static String solution(String mStr, String fStr) {
        //"No larger than 10^50" is w-a-ay out of long range. BigInts ftw.
        BigInteger m = new BigInteger(mStr);
        BigInteger f = new BigInteger(fStr);
        //Input validation because why not?
        if (m.compareTo(BigInteger.ZERO) <= 0 || f.compareTo(BigInteger.ZERO) <= 0) return "impossible";
        //BigInteger max = BigInteger.TEN.pow(50);
        // if (m.compareTo(max) >= 0 || f.compareTo(max) >= 0)
        //    throw new IllegalArgumentException();

        BigInteger genNum = countGen(m, f);
        return genNum.equals(BigInteger.valueOf(-1L)) ? "impossible" : String.valueOf(genNum);
    }

    //Reverse counting generations
    private static BigInteger countGen(BigInteger m, BigInteger f) {
        BigInteger gen = BigInteger.ZERO;
        while (true) {
            int oneCompM = m.compareTo(BigInteger.ONE);
            int oneCompF = f.compareTo(BigInteger.ONE);
            if (oneCompM == 0 && oneCompF == 0) break;
            if (oneCompM < 0 || oneCompF < 0) return BigInteger.valueOf(-1L);
            int mCompF = m.compareTo(f);
            if (mCompF == 0) return BigInteger.valueOf(-1L);
                //Had to use division instead of simple subtraction cycle for optimization
            else if (mCompF > 0) {
                if (oneCompF == 0) {
                    gen = gen.add(m).subtract(BigInteger.ONE);
                    m = BigInteger.ONE;
                } else {
                    BigInteger diff = m.subtract(f);
                    BigInteger mul = diff.divide(f).add(BigInteger.ONE);
                    gen = gen.add(mul);
                    m = m.subtract(f.multiply(mul));
                }
            } else {
                if (oneCompM == 0) {
                    gen = gen.add(f).subtract(BigInteger.ONE);
                    f = BigInteger.ONE;
                } else {
                    BigInteger diff = f.subtract(m);
                    BigInteger mul = diff.divide(m).add(BigInteger.ONE);
                    gen = gen.add(mul);
                    f = f.subtract(m.multiply(mul));
                }
            }
        }
        return gen;
    }
}