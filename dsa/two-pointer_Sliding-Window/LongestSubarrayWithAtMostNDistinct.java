import java.util.*;

public class LongestSubarrayWithAtMostNDistinct {

    public static int longestSubarrayWithAtMostNDistinct(int[] keyIds, int n) {

        Map<Integer, Integer> frequency = new HashMap<>();

        int start = 0;
        int maxLength = 0;

        for (int end = 0; end < keyIds.length; end++) {

            frequency.put(keyIds[end],
                    frequency.getOrDefault(keyIds[end], 0) + 1);

            while (frequency.size() > n) {

                int leftElement = keyIds[start];

                frequency.put(leftElement,
                        frequency.get(leftElement) - 1);

                if (frequency.get(leftElement) == 0) {
                    frequency.remove(leftElement);
                }

                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] keyIds = {1, 2, 1, 2, 3, 2, 2, 1};

        int n = 2;

        System.out.println(longestSubarrayWithAtMostNDistinct(keyIds, n));
    }
}
