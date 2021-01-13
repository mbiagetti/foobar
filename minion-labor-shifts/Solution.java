import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static int[] solution(int[] data, int n) {
        Map<Integer, Integer> myMap = new HashMap<>();

        for (int datum : data) {
            Integer curr = myMap.getOrDefault(datum, 0);
            myMap.put(datum, ++curr);
        }

        List<Integer> out = new ArrayList<>();
        for (Integer elem : data) {
            if (myMap.get(elem) <= n ) {
                out.add(elem);
            }
        }
        return out.stream().mapToInt(Integer::intValue).toArray();
    }
}