import junit.basic.fileprocessing.FileProcessor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    @TempDir
    Path tempDir; // Temporary directory for testing

    @Test
    void testWriteToFileAndReadFromFile() throws IOException {
        // Arrange
        FileProcessor fileProcessor = new FileProcessor();
        String filename = tempDir.resolve("testFile.txt").toString();
        String content = "Hello, World!";

        // Act
        fileProcessor.writeToFile(filename, content);
        String readContent = fileProcessor.readFromFile(filename);

        // Assert
        assertEquals(content, readContent, "The content read from the file should match the content written.");
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        // Arrange
        FileProcessor fileProcessor = new FileProcessor();
        String filename = tempDir.resolve("testFile.txt").toString();
        String content = "Hello, World!";

        // Act
        fileProcessor.writeToFile(filename, content);

        // Assert
        assertTrue(Files.exists(Paths.get(filename)), "The file should exist after writing.");
    }

    @Test
    void testReadFromFileThrowsIOException() {
        // Arrange
        FileProcessor fileProcessor = new FileProcessor();
        String filename = tempDir.resolve("nonExistentFile.txt").toString();

        // Act & Assert
        Exception exception = assertThrows(IOException.class, () -> {
            fileProcessor.readFromFile(filename);
        });

        String expectedMessage = "nonExistentFile.txt";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage), "The exception message should contain the filename.");
    }
}