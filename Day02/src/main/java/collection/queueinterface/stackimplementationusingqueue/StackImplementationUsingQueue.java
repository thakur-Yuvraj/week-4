package collection.queueinterface.stackimplementationusingqueue;

import java.util.LinkedList;
import java.util.Queue;

// Stack implementation using two queues class definition
public class StackImplementationUsingQueue {
    public static void main(String[] args) {
        // Queue declaration as stack
        Queue<Integer> stack = new LinkedList<>();
        // Adding to stack
        add(stack, 4);
        add(stack, 6);
        add(stack, 8);

        // Printing the stack elements
        printStack(stack);

        // Performing the pop and top operation
        pop(stack);
        top(stack);
    }

    // Method declaration for printing the stack
    public static <T> void printStack(Queue<T> stack) {
        for(T element : stack) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    // Method declaration for adding the element to the stack
    public static <T> void add(Queue<T> stack, T element) {
        // Temporary queue to add element as it is done in stack
        Queue<T> store = new LinkedList<>();
        store.add(element);

        while(!stack.isEmpty()) {
            store.add(stack.poll());
        }

        while(!store.isEmpty()) {
            stack.add(store.poll());
        }
    }

    // Method pop operation definition
    public static <T> void pop(Queue<T> stack) {
        if(stack.isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }

        T element = stack.poll();
        System.out.println(element + " is popped from queue");
    }

    // Method definition for top operation
    public static <T> void top(Queue<T> stack) {
        if(stack.isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }

        System.out.println("In stack top element is: " + stack.peek());
    }
}
