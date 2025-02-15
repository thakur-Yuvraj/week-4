package regex.advance.validateacreditcardnumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCard {
    // method to find if Credit card is valid or not
    public static boolean isValidCard(String number) {
        // Regex for IPv4 validation
        String regex = "^[5|4][0-9]{15}$";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher
        Matcher matcher = pattern.matcher(number);

        // Return whether the input matches the regex
        return matcher.matches();
    }

    public static void main(String[] args) {
        // Example cases
//        A Visa card number starts with 4 and has 16 digits.
//        A MasterCard starts with 5 and has 16 digits.

        String[] testCases = {
                "5985647521685435",  // valid
                "4985647521685435",  // valid
                "3985647521685435", // invalid
        };

        // Validate each test case
        for (String testCase : testCases) {
            System.out.println(testCase + " --> " + (isValidCard(testCase) ? "Valid" : "Invalid"));
        }
    }
}