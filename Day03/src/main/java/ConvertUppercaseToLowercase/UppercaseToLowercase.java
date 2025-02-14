package ConvertUppercaseToLowercase;

import java.io.*;

public class UppercaseToLowercase {

    public static void main(String[] args) throws IOException {
        String sourceFilePath = "src/main/java/ConvertUppercaseToLowercase/source.txt";
        String destinationFilePath = "src/main/java/ConvertUppercaseToLowercase/output.txt";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(sourceFilePath), "UTF-8")); // Specify UTF-8 encoding
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(destinationFilePath), "UTF-8"))) { // Specify UTF-8 encoding

            int character;
            while ((character = reader.read()) != -1) {
                char ch = (char) character; // Read as char to handle Unicode correctly
                if (Character.isUpperCase(ch)) {
                    writer.write(Character.toLowerCase(ch));
                } else {
                    writer.write(ch);
                }
            }

            System.out.println("File conversion complete.");

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}