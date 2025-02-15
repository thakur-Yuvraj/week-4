import junit.basic.testingstringutilitymethods.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void testReverse() {
        assertEquals("cba", StringUtils.reverse("abc"), "Reverse of 'abc' should be 'cba'");
        assertEquals("", StringUtils.reverse(""), "Reverse of an empty string should be empty");
        assertEquals("12321", StringUtils.reverse("12321"), "Reverse of '12321' should be '12321'");
    }

    @Test
    void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"), "'madam' should be a palindrome");
        assertTrue(StringUtils.isPalindrome("racecar"), "'racecar' should be a palindrome");
        assertFalse(StringUtils.isPalindrome("hello"), "'hello' should not be a palindrome");
        assertTrue(StringUtils.isPalindrome(""), "An empty string should be a palindrome");
        assertTrue(StringUtils.isPalindrome("a"), "A single character should be a palindrome");
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", StringUtils.toUpperCase("hello"), "Uppercase of 'hello' should be 'HELLO'");
        assertEquals("123ABC", StringUtils.toUpperCase("123abc"), "Uppercase of '123abc' should be '123ABC'");
        assertEquals("", StringUtils.toUpperCase(""), "Uppercase of an empty string should be empty");
    }
}