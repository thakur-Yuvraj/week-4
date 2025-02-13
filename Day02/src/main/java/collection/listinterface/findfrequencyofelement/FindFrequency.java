//Find Frequency of Elements
//        Given a list of strings, count the frequency of each element and return the results in a Map<String, Integer>.
//        Example:
//        Input: ["apple", "banana", "apple", "orange"] → Output: {apple=2, banana=1, orange=1}.


package collection.listinterface.findfrequencyofelement;

import java.util.*;

public class FindFrequency {
    // method to get frequency of element
    public static HashMap<String, Integer> getFrequency(List<String> list) {
        HashMap<String, Integer> frequency = new HashMap<>();
        for (String str : list) {
            frequency.put(str, frequency.getOrDefault(str, 0) + 1);
        }
        return frequency;
    }
    public static void main(String[] args) {
        // creating object of Arraylist
        List<String> fruits = new ArrayList<>();
        // given input ["apple", "banana", "apple", "orange"]
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");

        // getting the frequency of fruits
        HashMap<String, Integer> fruitsFrequency = new HashMap<>();
        fruitsFrequency = FindFrequency.getFrequency(fruits);

        // printing the frequency of fruits
        System.out.println(fruitsFrequency);
    }
}
