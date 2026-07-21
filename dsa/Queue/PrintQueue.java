import java.util.ArrayDeque;
import java.util.Deque;

public class PrintQueue {

    private Deque<Integer> printQueue = new ArrayDeque<>();

    public void submitJob(int jobId) {
        printQueue.addLast(jobId);
    }

    public void submitUrgentJob(int jobId) {
        printQueue.addFirst(jobId);
    }

    public int printNextJob() {
        return printQueue.removeFirst();
    }

    public int peekNextJob() {
        return printQueue.peekFirst();
    }
}
