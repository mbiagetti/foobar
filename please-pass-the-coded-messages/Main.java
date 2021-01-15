
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] q1 = new int[]{3, 1, 4, 1};
        int[] q2 = new int[]{3, 1, 4, 1, 5, 9};
        int[] q3 = new int[]{2,3,1};
        int s1 = 4311;
        int s2 = 94311;
        int s3 = 321;
        System.out.printf("%d should be equal to %d\n",Solution.solution(q1), s1);
        System.out.printf("%d should be equal to %d\n",Solution.solution(q2), s2);
        System.out.printf("%d should be equal to %d\n",Solution.solution(q3), s3);
    }
}
