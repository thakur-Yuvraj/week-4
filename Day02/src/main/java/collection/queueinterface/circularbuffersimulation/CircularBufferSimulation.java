package collection.queueinterface.circularbuffersimulation;

import java.util.ArrayDeque;
import java.util.Queue;

// CircularBufferSimulation class definition
public class CircularBufferSimulation {
    public static void main(String[] args) {
        // Queue declaration
        Queue<Integer> queue = new ArrayDeque<>();
        // Defining the size of circular buffer
        int size = 3;

        // Performing the add operation
        addOperation(queue, 4, size);
        addOperation(queue, 5, size);
        addOperation(queue, 6, size);
        // Printing the queue elements before exceeding the size
        print(queue);

        // Adding element beyond declared the size
        addOperation(queue, 7, size);
        // Printing the queue to check effect of circular buffered
        print(queue);
    }

    // Printing the queue
    public static <T> void print(Queue<T> queue) {
        for(T element : queue) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    // Method definition for adding in queue as circular queue
    public static <T> void addOperation(Queue<T> queue, T element, int size) {
        // If queue size equal to size of given circular queue, then pop from front
        if(queue.size() == size) {
            queue.remove();
        }

        // Add element at the back in each case
        queue.add(element);
    }
}
