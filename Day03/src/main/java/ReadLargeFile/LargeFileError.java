package ReadLargeFile;

import java.io.*;

public class LargeFileError {
    public static void main(String[] args) throws IOException {
        String filePath = "src/main/java/ReadLargeFile/example.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            long lineNumber = 0; // Keep track of line numbers

            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (line.toLowerCase().contains("error")) { // Case-insensitive check
                    System.out.println(line); // Just the line
                }
            }

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}