import junit.basic.testingacalculatorclass.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
        assertEquals(-1, calculator.add(-2, 1), "-2 + 1 should equal -1");
    }

    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equal 1");
        assertEquals(-5, calculator.subtract(0, 5), "0 - 5 should equal -5");
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
        assertEquals(0, calculator.multiply(0, 5), "0 * 5 should equal 0");
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3), "6 / 3 should equal 2");
        assertEquals(-2, calculator.divide(-6, 3), "-6 / 3 should equal -2");
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(1, 0);
        });

        String expectedMessage = "Division by zero is not allowed.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}