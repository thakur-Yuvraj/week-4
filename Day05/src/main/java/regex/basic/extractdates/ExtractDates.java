//Extract Dates in dd/mm/yyyy Format
//         Example Text:
//        "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020."
//         Expected Output:
//        12/05/2023, 15/08/2024, 29/02/2020


package regex.basic.extractdates;
import java.util.regex.*;
public class ExtractDates {

    // method to extract dates from a text
    public static void extractDates(String text) {
        //Extract Dates in dd/mm/yyyy Format
        String regex = "\\b[0-9]{2}/[0-9]{2}/[0-9]{4}\\b";
        String regex2 = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        // creating a pattern
        Pattern pattern = Pattern.compile(regex);

        // matching
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }

    public static void main(String[] args) {
        // Example Text:
        // "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020."
        String input1 = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        //Expected Output:
        //12/05/2023, 15/08/2024, 29/02/2020
        extractDates(input1);
    }
}
