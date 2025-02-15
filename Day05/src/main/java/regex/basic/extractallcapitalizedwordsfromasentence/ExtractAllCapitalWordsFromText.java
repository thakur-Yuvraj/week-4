//Extract All Capitalized Words from a Sentence
//         Example Text:
//        "The Eiffel Tower is in Paris and the Statue of Liberty is in New York."
//         Expected Output:
//        Eiffel, Tower, Paris, Statue, Liberty, New, York

package regex.basic.extractallcapitalizedwordsfromasentence;

import java.util.regex.*;

public class ExtractAllCapitalWordsFromText {

    // Method to extract all Capital words from a text
    public static void extractCapitals(String text) {
        // Regex pattern for matching Capital words
        String regex = "\\b[A-Z][a-z]*\\b";

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
//         Example Text:
        String input1 = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

//         Expected Output:
//        Eiffel, Tower, Paris, Statue, Liberty, New, York
        extractCapitals(input1);

    }
}