import junit.basic.testingexceptionhandling.Divide;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivideTest {

    @Test
    void testDivideValidInput() {
        assertEquals(2, Divide.divide(10, 5), "10 / 5 should equal 2");
        assertEquals(-3, Divide.divide(9, -3), "9 / -3 should equal -3");
    }

    @Test
    void testDivideByZero() {
        // Verify that the exception is thrown
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Divide.divide(10, 0);
        });

        // Verify the exception message
        String expectedMessage = "Division by zero is not allowed.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}