package webtraining.zone.queues;

import java.util.LinkedList;
import java.util.StringJoiner;

public class Queue<E> {

    private LinkedList<E> elements;

    public Queue() {
        this.elements = new LinkedList<E>();
    }

    // Adds a new item to the rear of the queues. It needs the item and returns nothing.
    public void enqueue(E element) {
        this.elements.addLast(element);
    }

    // Removes the front item from the queues. It needs no parameters and returns the item. The queues is modified.
    public E dequeue() {
        // Get first element
        E element = this.elements.getFirst();
        this.elements.removeFirst();
        return element;
    }

    // Tests to see whether the queues is empty. It needs no parameters and returns a boolean value.
    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    // returns the number of items in the queues. It needs no parameters and returns an integer.
    public int size() {
        return this.elements.size();
    }

    public E peek() {
        E element = this.elements.getFirst();
        return element;
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(" <- ", "[", "]");

        for (E element : this.elements) {
            stringJoiner.add(element.toString());
        }

        return stringJoiner.toString();
    }
}
