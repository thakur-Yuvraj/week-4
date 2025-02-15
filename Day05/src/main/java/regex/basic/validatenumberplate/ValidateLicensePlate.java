//Validate a License Plate Number
//        License plate format: Starts with two uppercase letters, followed by four digits.
//        Example: "AB1234" is valid, but "A12345" is invalid.

package regex.basic.validatenumberplate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.regex.*;

public class ValidateLicensePlate {

    // method to check if License is valid or not
    public static boolean validateLicenseNumber(String licenseNumber) {
//        License plate format: Starts with two uppercase letters, followed by four digits.
        String regex = "^[A-Z]{2}[0-9]{4}$";

        Pattern pattern = Pattern.compile(regex);

        // creating a matcher
        Matcher matcher = pattern.matcher(licenseNumber);

        // result
        return matcher.matches();
    }

    public static void main(String[] args) {
//        Example: "AB1234" is valid, but "A12345" is invalid.

        String input1 = "AB1234";
        String input2 = "A12345";

        // checking if input is valid or not
        System.out.println(validateLicenseNumber(input1));
        System.out.println(validateLicenseNumber(input2));

    }
}
