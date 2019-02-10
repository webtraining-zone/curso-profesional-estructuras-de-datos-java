package webtraining.zone.stacks;

import webtraining.zone.queues.Queue;

public class StackTest {
    // Examples of stacks: history back of a router
    public static void main(String[] args) {
        // Last-in, first-out
        Stack<Integer> queue = new Stack<>();

        for (int i = 0; i < 5; i++) {
            queue.push(i);
        }

        System.out.println(queue);

        int a = queue.pop();
        int b = queue.pop();

        System.out.println(queue);

    }
}
