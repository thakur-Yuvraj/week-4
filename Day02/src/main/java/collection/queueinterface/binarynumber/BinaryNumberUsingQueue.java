package collection.queueinterface.binarynumber;

import java.util.LinkedList;
import java.util.Queue;

// BinaryNumberUsingQueue class definition
public class BinaryNumberUsingQueue {
    public static void main(String[] args) {
        // Take any number
        int n = 10;
        // Get number's binary
        String target = getBinary(n);

        // Queue declaration for storing result
        Queue<String> queue = new LinkedList<>();
        // Method invocation for getting all smaller number binary
        getAllBinaryNumbers(n, target, queue);

        // Iterate each result and print it.
        for (String binary : queue) {
            System.out.print(binary + "  ");
        }
    }

    // Method definition for generating the binary number
    public static String getBinary(int n) {
        String binary = "";

        while(n > 0) {
            int remainder = n % 2;
            binary = remainder + binary;
            n /= 2;
        }

        return binary;
    }

    // Method declaration for generating all the binary numbers
    public static void getAllBinaryNumbers(int n, String target, Queue<String> result) {
        // Temporary queue for generating all results
        Queue<String> store = new LinkedList<>();
        store.add("1");
        result.add("1");

        if(target.equals("1")) store.poll();

        // get all elements of queue and operate on that one by one
        while(!store.isEmpty()) {
            // Get peek
            String binary = store.poll();

            // Check after adding 0 at end
            if(!(binary + "0").equals(target)) {
                store.add(binary + "0");
                result.add((binary + "0"));
            } else {
                result.add(binary + "0");
                break;
            }

            // Check after adding 1 at the end
            if(!(binary + "1").equals(target)) {
                store.add(binary + "1");
                result.add(binary + "1");
            } else {
                result.add(binary + "1");
            }
        }
    }
}
