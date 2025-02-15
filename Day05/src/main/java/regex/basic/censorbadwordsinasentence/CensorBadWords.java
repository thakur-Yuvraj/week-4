//Censor Bad Words in a Sentence
//Given a list of bad words, replace them with ****.
//        Example Input:
//        "This is a damn bad example with some stupid words."
//        Expected Output:
//        "This is a **** bad example with some **** words."

package regex.basic.censorbadwordsinasentence;

import java.util.*;

public class CensorBadWords {
    public static void main(String[] args) {
        // list of bad words
        List<String> badWords = new ArrayList<>(Arrays.asList(new String[] {"damn", "stupid", "idot"}));

        // Example Input:
        // "This is a damn bad example with some stupid words."
        String input = "This is a damn bad example with some stupid words.";


        // Construct the regex pattern dynamically
        String regex = "(?i)\\b(" + String.join("|", badWords) + ")\\b";

        // making the output string
        String output = input.replaceAll(regex, "****");

        //Expected Output:
        //"This is a **** bad example with some **** words."
        System.out.println(output);


    }
}
