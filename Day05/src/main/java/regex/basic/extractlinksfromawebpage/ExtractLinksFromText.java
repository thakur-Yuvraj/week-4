//Extract Links from a Web Page
//Example Text:
//"Visit https://www.google.com and http://example.org for more info."
// Expected Output:
//https://www.google.com, http://example.org

package regex.basic.extractlinksfromawebpage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinksFromText {
    // method to extract valid links from text
    public static void extractLinks(String text) {
        // regex for valid hyperlink
        String regex = "\\bhttps?://[\\w.-]+(?:/\\S*)?\\b";

        // compiling regex
        Pattern pattern = Pattern.compile(regex);

        // making a pattern
        Matcher matcher = pattern.matcher(text);

        // printing hyperlinks
        while(matcher.find()) {
            System.out.println(matcher.group());
        }

    }
    public static void main(String[] args) {
        //Extract Links from a Web Page
        //Example Text:
        //"Visit https://www.google.com and http://example.org for more info."
        String input1 = "Visit https://www.google.com and http://example.org for more info.";

        // Expected Output:
        //https://www.google.com, http://example.org
        extractLinks(input1);
    }
}
