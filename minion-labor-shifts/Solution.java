import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static int[] solution(int[] data, int n) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> out = new ArrayList<>();

        for (int datum : data)
            frequencyMap.put(datum, frequencyMap.getOrDefault(datum, 0) + 1);

        for (Integer elem : data)
            if (frequencyMap.get(elem) <= n )
                out.add(elem);

        return out.stream().mapToInt(Integer::intValue).toArray();
    }
}