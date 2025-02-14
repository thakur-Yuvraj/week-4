package StoreAndRetrievePrimitiveData;

import java.io.*;

public class StudentDataStorage {

    private static final String FILE_NAME = "src/main/java/StoreAndRetrievePrimitiveData/details.txt";

    public static void main(String[] args) {
        // Store student data
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME))) {
            // Example student data (you can add more)
            dos.writeInt(101); // Roll number
            dos.writeUTF("Alice"); // Name (UTF for strings)
            dos.writeDouble(3.8); // GPA

            dos.writeInt(102);
            dos.writeUTF("Bob");
            dos.writeDouble(3.5);

            System.out.println("Student data stored successfully.");
        } catch (IOException e) {
            System.err.println("Error storing student data: " + e.getMessage());
        }


        // Retrieve student data
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            System.out.println("\nRetrieving student data:");
            while (true) { // Read until EOFException
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println("Roll Number: " + rollNumber);
                System.out.println("Name: " + name);
                System.out.println("GPA: " + gpa);
                System.out.println("--------------------");
            }
        } catch (EOFException e) {
            System.out.println("End of file reached."); // Expected when all data is read
        } catch (IOException e) {
            System.err.println("Error retrieving student data: " + e.getMessage());
        }
    }
}