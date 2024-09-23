import java.util.Arrays;
import java.util.PriorityQueue;

public class QuestionThree {
    public static void main(String[] args) {
        // Create two priority Queues
        PriorityQueue<String> queueOne = new PriorityQueue<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        PriorityQueue<String> queueTwo = new PriorityQueue<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));

        // Merge two priority queues into a new priority queue
        PriorityQueue<String> combinedQueue = new PriorityQueue<>(queueOne);
        combinedQueue.addAll(queueTwo);

        // Print the merged priority queue to the screen
        System.out.println("Merged Priority Queue is shown below: \n");
        System.out.println(combinedQueue);
    }
}
