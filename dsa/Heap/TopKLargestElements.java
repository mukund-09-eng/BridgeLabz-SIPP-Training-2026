import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class TopKLargestElements {

    public static List<Integer> topKLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {

            if (minHeap.size() < k) {

                minHeap.offer(num);

            } else if (num > minHeap.peek()) {

                minHeap.poll();
                minHeap.offer(num);
            }
        }

        return new ArrayList<>(minHeap);
    }
}
