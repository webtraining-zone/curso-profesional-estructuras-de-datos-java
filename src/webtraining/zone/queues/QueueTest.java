package webtraining.zone.queues;

public class QueueTest {
    // Examples of queues: waiting, in a restaurant, a printing queues, when you request a ride by Uber
    public static void main(String[] args) {
        // First-in, first-out
        Queue<Integer> queue = new Queue<>();

        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }

        System.out.println(queue);

        int a = queue.dequeue();
        int b = queue.dequeue();

        System.out.println(queue);

    }
}
