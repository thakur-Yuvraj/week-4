package regex.advance.validateasocialsecuritynumber;

import java.util.regex.*;

public class SSNValidator {

    public static void isSSN(String text) {
        // Regex to match SSNs in text
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            // Find and print all matches
             do {
                System.out.println("Found SSN: " + matcher.group());
            } while (matcher.find());
             return;
        }
        // if ssn does not exist
        System.out.println("no ssn found in the text");
    }

    public static void main(String[] args) {
        // Example Text:
        String text = "My SSN is 123-45-6789.";
        String text2 = "My SSN is 123456789.";

        // printing the output
        isSSN(text);
        isSSN(text2);
    }
}