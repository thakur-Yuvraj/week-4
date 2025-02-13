package collection.queueinterface.reverseque;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Reverse Queue class definition
public class ReverseQueue {
    public static void main(String[] args) {
        // Queue declaration
        Queue<Integer> queue = new LinkedList<>();
        // Adding elements
        queue.add(23);
        queue.add(34);
        queue.add(45);

        // Method invocation for reversing the queue
        getReversedQueue(queue);
        // Printing the reversed queue
        System.out.println(queue);
    }

    // Generic method to handle all type of queue for reversing
    public static <T> void getReversedQueue(Queue<T> queue) {
        // Stack for storing the elements
        Stack<T> store = new Stack<>();

        // Adding into stack from front
        while(!queue.isEmpty()) {
            store.push(queue.remove());
        }

        // Storing into the queue from stack in reversed manner
        while (!store.isEmpty()) {
            queue.add(store.pop());
        }
    }
}
