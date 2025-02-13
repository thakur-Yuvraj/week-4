package collection.mapinterface.mergetwomap;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMap {
    public static void main(String[] args) {
        // Declaring the hashmap
        HashMap<Character, Integer> map1 = new HashMap<>();
        map1.put('A', 45);
        map1.put('B', 39);
        map1.put('C', 23);
        map1.put('D', 56);

        // Declaring another hashmap
        HashMap<Character, Integer> map2 = new HashMap<>();
        map2.put('C', 4);
        map2.put('D', 3);
        map2.put('E', 23);
        map2.put('F', 56);

        // Method invocation for merging
        HashMap<Character, Integer> result = getMergedMap(map1, map2);

        // Printing the result
        for(Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Method declaration for merging maps
    private static HashMap<Character, Integer> getMergedMap(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2) {
        HashMap<Character, Integer> result = new HashMap<>(map1);

        // Adding the value of common keys
        for(Map.Entry<Character, Integer> entry : map2.entrySet()) {
            if(result.containsKey(entry.getKey())) {
                result.put(entry.getKey(), entry.getValue() + result.get(entry.getKey()));
            } else result.put(entry.getKey(), entry.getValue());
        }

        // Returning the result
        return result;
    }
}
