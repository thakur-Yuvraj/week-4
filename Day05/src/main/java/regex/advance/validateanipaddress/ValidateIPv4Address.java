package regex.advance.validateanipaddress;
import java.util.regex.*;

public class ValidateIPv4Address {
    // method to find if ip is valid or not
    public static boolean isValidIPv4(String ipAddress) {
        // Regex for IPv4 validation
        String regex = "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher
        Matcher matcher = pattern.matcher(ipAddress);

        // Return whether the input matches the regex
        return matcher.matches();
    }

    public static void main(String[] args) {
        // example cases
        String[] testCases = {
                "192.168.1.1",      // Valid
                "255.255.255.255",  // Valid
                "0.0.0.0",          // Valid
                "256.256.256.256",  // Invalid (numbers > 255)
                "192.168.1",        // Invalid (only 3 groups)
                "192.168.1.1.1",    // Invalid (5 groups)
        };

        // Validate each test case
        for (String testCase : testCases) {
            System.out.println(testCase + " --> " + (isValidIPv4(testCase) ? "Valid" : "Invalid"));
        }
    }
}