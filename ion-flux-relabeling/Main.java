import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // TC 1
        int q1 = 5;
        int[] q2 = new int[]{19, 14, 28};
        String a1 = "21,15,29";

        System.out.printf("%s should be equal to %s\n",
                Arrays.toString(Solution.solution(q1,q2)), a1);
        // TC 2
        int q3 = 3;
        int[] q4 = new int[]{7, 3, 5, 1};
        String a2 = "-1,7,6,3";

        System.out.printf("%s should be equal to %s\n",
                Arrays.toString(Solution.solution(q3,q4)), a2);

        // MY TC
        int q5 = 4;
        int[] q6 = new int[]{7, 3, 5, 1};
        String a3 = "15,7,6,3";

        System.out.printf("%s should be equal to %s\n",
                Arrays.toString(Solution.solution(q5,q6)), a3);
    }

}
