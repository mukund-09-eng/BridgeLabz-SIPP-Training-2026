import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

    public static int subarraySumEqualsK(int[] revenueChanges, int k) {
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1);

        int runningSum = 0;
        int answer = 0;

        for (int change : revenueChanges) {
            runningSum += change;

            answer += prefixCount.getOrDefault(runningSum - k, 0);

            prefixCount.merge(runningSum, 1, Integer::sum);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(subarraySumEqualsK(arr, 3));
    }
}
