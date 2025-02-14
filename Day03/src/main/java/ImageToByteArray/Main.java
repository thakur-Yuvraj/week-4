package ImageToByteArray;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String originalImagePath = "src/main/java/ImageToByteArray/practice.png";
        String newImagePath = "src/main/java/ImageToByteArray/img.png";

        // 1. Convert image to byte array
        byte[] imageBytes = ImageToByteArray.imageToByteArray(originalImagePath);

        // 2. Write byte array to a new image file
        ImageToByteArray.byteArrayToImage(imageBytes, newImagePath);

        // 3. Verify the images are identical (optional, but good practice)
        if (ImageToByteArray.verifyImages(originalImagePath, newImagePath)) {
            System.out.println("Images are identical.");
        } else {
            System.out.println("Images are NOT identical.");
        }
    }
}