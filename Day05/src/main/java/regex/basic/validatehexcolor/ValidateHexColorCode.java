//Validate a Hex Color Code
//        A valid hex color:
//        Starts with a #
//        Followed by 6 hexadecimal characters (0-9, A-F, a-f).
//        🔹 Example Inputs & Outputs
//        ✅ "#FFA500" → Valid
//        ✅ "#ff4500" → Valid
//        ❌ "#123" → Invalid (too short)


package regex.basic.validatehexcolor;

import java.util.regex.*;

public class ValidateHexColorCode {

    // method to check if hex color is valid or not
    public static boolean validateHexColor(String hexColorCode) {
//        A valid hex color:
//        Starts with a #
//        Followed by 6 hexadecimal characters (0-9, A-F, a-f).
        String regex = "^#[0-9A-Fa-f]{6}$";

        Pattern pattern = Pattern.compile(regex);

        // creating a matcher
        Matcher matcher = pattern.matcher(hexColorCode);

        // result
        return matcher.matches();
    }

    public static void main(String[] args) {
//         Example Inputs & Outputs
//         "#FFA500" → Valid
//         "#ff4500" → Valid
//         "#123" → Invalid (too short

        String input1 = "#FFA500";
        String input2 = "#ff4500";
        String input3 = "#123";

        // checking if input is valid or not
        System.out.println(validateHexColor(input1));
        System.out.println(validateHexColor(input2));
        System.out.println(validateHexColor(input3));

    }
}