package exceptionhandling.checkedexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadHandler {
    public static void main(String[] args) {
        // file name
        String fileName = "data.txt";

        // Try-with-resources to automatically close the BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Read and print each line of the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle the IOException if the file does not exist or cannot be read
            System.out.println("File not found: " + e.getMessage());
        }
    }
}