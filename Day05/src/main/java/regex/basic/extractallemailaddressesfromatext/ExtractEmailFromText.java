//Extraction Problems
//4️ Extract All Email Addresses from a Text
// Example Text:
//        "Contact us at support@example.com and info@company.org"
//         Expected Output:
//support@example.com
//info@company.org


package regex.basic.extractallemailaddressesfromatext;

import java.util.regex.*;

public class ExtractEmailFromText {

    // Method to extract all email addresses from a text
    public static void extractEmails(String text) {
        // Regex pattern for matching email addresses
        String regex = "[a-zA-Z0-9._+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher
        Matcher matcher = pattern.matcher(text);

        // Find all matches and print them
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
//      Example Text:
//     "Contact us at support@example.com and info@company.org"

        String input1 = "Contact us at support@example.com and info@company.org";

//      Expected Output:
        //support@example.com
        //info@company.org
        extractEmails(input1);

    }
}