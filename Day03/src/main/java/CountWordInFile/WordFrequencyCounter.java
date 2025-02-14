package CountWordInFile;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {

    public static void main(String[] args) throws IOException {
        String filePath = "src/main/java/CountWordInFile/test.txt"; // file path

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            Map<String, Integer> wordCounts = new HashMap<>();
            String line;

            while ((line = reader.readLine()) != null) {
                // Remove punctuation and convert to lowercase for consistent counting
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "").split("\\s+"); // Improved regex

                for (String word : words) {
                    if (!word.isEmpty()) { // Skip empty strings
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Sort words by frequency (descending)
            List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCounts.entrySet());
            sortedWords.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

            // Display the top 5 words
            System.out.println("Top 5 most frequent words:");
            int count = 0;
            for (Map.Entry<String, Integer> entry : sortedWords) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
                count++;
                if (count >= 5) {
                    break;
                }
            }

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}