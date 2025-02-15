import junit.basic.testingbeforeeachandaftereachannotation.DatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {

    private DatabaseConnection dbConnection;

    // This method runs before each test
    @BeforeEach
    void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
        System.out.println("Database connection initialized.");
    }

    // This method runs after each test
    @AfterEach
    void tearDown() {
        dbConnection.disconnect();
        System.out.println("Database connection closed.");
    }

    @Test
    void testConnectionIsActive() {
        assertTrue(dbConnection.isConnected(), "Database connection should be active.");
    }

    @Test
    void testDisconnect() {
        dbConnection.disconnect();
        assertFalse(dbConnection.isConnected(), "Database connection should be inactive after disconnecting.");
    }
}