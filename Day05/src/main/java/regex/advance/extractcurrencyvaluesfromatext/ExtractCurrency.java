package regex.advance.extractcurrencyvaluesfromatext;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrency {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";

        // Define the regex pattern to match currency values (e.g., $45.99, 10.50)
        String regex = "\\$?\\d+\\.\\d{2}|\\d+\\.\\d{2}";

        // Create a Pattern object and match the regex
        Pattern r = Pattern.compile(regex);
        Matcher m = r.matcher(text);

        // Use a list to store the matched values
        List<String> values = new ArrayList<>();

        // Find and print all matched values
        while (m.find()) {
            values.add(m.group());
        }

        // Output the extracted values
        System.out.println("Extracted values: " + String.join(", ", values));
    }
}
