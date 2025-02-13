package collection.mapinterface.wordfrequencycounter;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        // Text declaration
        String str = "Hello world, hello Java!";
        // HashMap declaration
        HashMap<String, Integer> counter = new HashMap<>();

        // Method invocation for counting word and it's count in hashmap
        getWordCounted(str, counter);

        // Iterating the hashmap and print each key-value pair
        for(Map.Entry<String, Integer> entry : counter.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Method definition for storing the count of each word
    public static void getWordCounted(String str, HashMap<String, Integer> counter) {
        // Splitting the word
        String[] words = str.split(" ");

        // Transforming each word to lower case after removing punctuation if present
        for(int i=0; i<words.length; i++) {
            String word = words[i];

            // Removing punctuation
            if(word.length() != 1) {
                char last = word.charAt(word.length() - 1);
                if (last < 97 || last > 122) word = word.substring(0, word.length() - 1);
            }

            // Converting to lower case
            words[i] = word.toLowerCase();
        }

        for(String word : words) {
            counter.put(word, counter.getOrDefault(word, 0) + 1);
        }
    }
}
