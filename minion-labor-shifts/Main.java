
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] in = new int[]{1, 2, 3, 4, 5, 2, 5, 2};

        System.out.println(Arrays.toString(Solution.solution(in, 0)));
        System.out.println(Arrays.toString(Solution.solution(in, 1)));
        System.out.println(Arrays.toString(Solution.solution(in, 2)));
        System.out.println(Arrays.toString(Solution.solution(in, 3)));
    }
}
