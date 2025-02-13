package collection.mapinterface.invertingmap;

import java.util.*;

public class InvertingMap {
    public static void main(String[] args) {
        // HashMap declaration
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Sanjay", 2);
        map.put("Raj", 1);
        map.put("Pankaj", 1);
        map.put("Dilip", 2);

        // Method invocation for inverting the map
        HashMap<Integer, List<String>> result = invertMap(map);

        // Printing the result
        for(Map.Entry<Integer, List<String>> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Method definition for inverting the map and sorting the list of values
    public static <K,V> HashMap<V, List<K >> invertMap(HashMap<K, V> map) {
        // Hashmap declaration for storing the end result
        HashMap<V, List<K>> result = new HashMap<>();
        List<K> list;

        // Iterating the map and storing the key in list for same value
        for(Map.Entry<K, V> entry : map.entrySet()) {
            if(!result.containsKey(entry.getValue())) {
                list = new ArrayList<>();
                list.add(entry.getKey());
                result.put(entry.getValue(), list);
            } else {
                list = result.get(entry.getValue());
                K value = entry.getKey();

                if(list.contains(value)) continue;
                list.add(value);
            }
        }

        // Sorting the list in map one by one
        for(Map.Entry<V, List<K>> entry : result.entrySet()) {
            Collections.sort(entry.getValue(),(x,y)->x.toString().compareTo(y.toString()));
        }

        // Returning the result
        return result;
    }
}
