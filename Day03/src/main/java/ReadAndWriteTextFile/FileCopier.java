package ReadAndWriteTextFile;

import java.io.*;

public class FileCopier {
    public static void main(String[] args) {
        String sourceFilePath = "src/main/java/ReadAndWriteTextFile/example.txt";
        String destinationFilePath = "src/main/java/ReadAndWriteTextFile/newFile.txt";

        try {
            File sourceFile = new File(sourceFilePath);

            if (!sourceFile.exists()) {
                System.err.println("Source file '" + sourceFilePath + "' does not exist.");
                return; // Exit the program if the source file doesn't exist
            }

            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destinationFilePath);

            // Use a buffer for efficient reading/writing
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                // Write the read bytes to the destination file
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully from '" + sourceFilePath + "' to '" + destinationFilePath + "'.");

            fis.close();
            fos.close();
        } catch (IOException e) {
            System.err.println("An error occurred during file copying: " + e.getMessage());
        }
    }
}