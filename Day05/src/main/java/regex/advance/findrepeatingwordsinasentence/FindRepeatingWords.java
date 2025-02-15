package regex.advance.findrepeatingwordsinasentence;

import java.util.regex.*;
import java.util.*;

public class FindRepeatingWords {
    public static void main(String[] args) {
        // Example Input:
        String text = "This is is a repeated repeated word test.";

        // Regex to find repeating words
        String regex = "\\b(\\w+)\\s+\\1\\b";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher
        Matcher matcher = pattern.matcher(text);

        // Use a Set to store unique repeating words
        Set<String> repeatingWords = new HashSet<>();

        // Find all matches
        while (matcher.find()) {
            repeatingWords.add(matcher.group(1)); // Add the repeating word to the set
        }

        // Print the result
        System.out.println("Repeating Words: " + String.join(", ", repeatingWords));
    }
}
