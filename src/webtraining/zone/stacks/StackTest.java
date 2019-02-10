package webtraining.zone.stacks;

import webtraining.zone.queues.Queue;

public class StackTest {
    // See a graphical demo: https://visualgo.net/en/list
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

        // Don't remove the element, just "take a look at it"!
        System.out.println("Element at TOP: " + queue.peek());

        System.out.println(queue);

    }
}
