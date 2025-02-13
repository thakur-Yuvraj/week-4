package collection.mapinterface.findkeywithhighestvalue;

import java.util.HashMap;
import java.util.Map;

public class FindKeyWithHighestValue {
    public static void main(String[] args) {
        // Declaring the hashmap
        HashMap<Character, Integer> store = new HashMap<>();
        store.put('A', 45);
        store.put('B', 39);
        store.put('C', 23);
        store.put('D', 56);
        store.put('E', 29);

        // Variable for storing the result and corresponding maximum values
        char result = ' ';
        int maximum = 0;

        // Iterating to get the result
        for(Map.Entry<Character, Integer> entry : store.entrySet()) {
            if(maximum < entry.getValue()) {
                maximum = entry.getValue();
                result = entry.getKey();
            }
        }

        // Printing the result
        System.out.println("The key with the maximum value is: " + result);
    }
}
