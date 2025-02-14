package EfficientFileCopy;

import java.io.*;

public class CopyFile {
    private static final int BUFFER_SIZE = 4096; // 4KB

    static long copyFileBuffered(String source, String destination) throws IOException {
        long startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             BufferedInputStream bis = new BufferedInputStream(fis);
             FileOutputStream fos = new FileOutputStream(destination);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
        return System.nanoTime() - startTime;
    }

    static long copyFileUnbuffered(String source, String destination) throws IOException {
        long startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            int byteRead;
            while ((byteRead = fis.read()) != -1) {  // Read byte by byte
                fos.write(byteRead);
            }
        }
        return System.nanoTime() - startTime;
    }


    static void createLargeFile(String filePath, long size) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            byte[] buffer = new byte[BUFFER_SIZE];
            for (long i = 0; i < size / BUFFER_SIZE; i++) {
                fos.write(buffer); // Write a chunk
            }
            // Write any remaining bytes (if the file size is not a multiple of buffer size)
            long remaining = size % BUFFER_SIZE;
            if (remaining > 0) {
                fos.write(buffer, 0, (int)remaining);
            }
        }
    }
}
