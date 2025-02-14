package ImageToByteArray;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ImageToByteArray {
    public static byte[] imageToByteArray(String imagePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(imagePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[1024]; // Use a buffer for efficiency
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        }
    }

    public static void byteArrayToImage(byte[] imageBytes, String newImagePath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(newImagePath)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    public static boolean verifyImages(String path1, String path2) throws IOException {
        byte[] file1Bytes = Files.readAllBytes(Paths.get(path1));
        byte[] file2Bytes = Files.readAllBytes(Paths.get(path2));
        return Arrays.equals(file1Bytes, file2Bytes);
    }
}