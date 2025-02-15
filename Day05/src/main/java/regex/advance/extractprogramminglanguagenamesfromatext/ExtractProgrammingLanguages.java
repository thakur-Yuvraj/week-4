package regex.advance.extractprogramminglanguagenamesfromatext;

import java.util.regex.*;
import java.util.*;

public class ExtractProgrammingLanguages {
    public static void main(String[] args) {
        // List of programming languages
        List<String> languages = Arrays.asList("Java", "Python", "JavaScript", "Go");

        // Example Text
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // Construct the regex pattern dynamically
        String regex = "\\b(" + String.join("|", languages) + ")\\b\\W*";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        // Create a matcher
        Matcher matcher = pattern.matcher(text);

        // print all matches
        System.out.println("Languages:");
        while (matcher.find()) {
            System.out.println(matcher.group().replaceAll("\\W", "")); // Remove non-word characters
        }
    }
}
