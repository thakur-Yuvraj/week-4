//import junit.basic.testingparametrizedtests.Even;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class EvenTest {
//
//    @ParameterizedTest
//    @ValueSource(ints = {2, 4, 6}) // Even numbers
//    void testIsEven_WithEvenNumbers(int number) {
//        assertTrue(Even.isEven(number), number + " should be even.");
//    }
//
//    @ParameterizedTest
//    @ValueSource(ints = {7, 9, 11}) // Odd numbers
//    void testIsEven_WithOddNumbers(int number) {
//        assertFalse(Even.isEven(number), number + " should not be even.");
//    }
//}