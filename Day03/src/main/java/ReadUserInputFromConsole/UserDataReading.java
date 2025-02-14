package ReadUserInputFromConsole;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserDataReading {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "src/main/java/ReadUserInputFromConsole/test.txt"; // Name of the file to save data

        try (FileWriter writer = new FileWriter(fileName)) { // Try-with-resources

            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine()); // Parse age as an integer

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Write the data to the file
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");

            System.out.println("User data saved to " + fileName);

        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid age input. Please enter a number.");
        }
    }
}
