package regex.basic.replaceandmodifystrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
        // Input string with multiple spaces
        String input = "This   is an   example   with multiple   spaces.";

        // Replace multiple spaces with a single space
        String output = input.replaceAll("\\s+", " ");

        // Print the result
        System.out.println(output);
    }
}