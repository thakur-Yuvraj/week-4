//Basic Regex Problems
//1️⃣ Validate a Username
//A valid username:
//Can only contain letters (a-z, A-Z), numbers (0-9), and underscores (_)
//Must start with a letter
//Must be between 5 to 15 characters long
//🔹 Example Inputs & Outputs
//✅ "user_123" → Valid
//❌ "123user" → Invalid (starts with a number)
//❌ "us" → Invalid (too short)



package regex.basic.validateusername;

import java.util.regex.*;

public class ValidateUsername {

    // method to check if user is valid or not
    public static boolean validateUser(String username) {
        // creating regex to validate username
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

        Pattern pattern = Pattern.compile(regex);

        // creating a matcher
        Matcher matcher = pattern.matcher(username);

        // result
        return matcher.matches();
    }

    public static void main(String[] args) {
        // Example Inputs & Outputs
        // "user_123" → Valid
        // "123user" → Invalid (starts with a number)
        // "us" → Invalid (too short)

        String input1 = "user_123";
        String input2 = "123user";
        String input3 = "us";
        String input4 = "Ankit";

        // checking if input is valid or not
        System.out.println(validateUser(input1));
        System.out.println(validateUser(input2));
        System.out.println(validateUser(input3));
        System.out.println(validateUser(input4));

    }
}
