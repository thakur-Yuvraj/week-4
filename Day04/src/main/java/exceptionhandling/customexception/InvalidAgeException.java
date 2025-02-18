package exceptionhandling.customexception;
// InvalidAgeException class definition
public class InvalidAgeException extends Exception {
    // Parameterized constructor
    InvalidAgeException(String message) {
        // Passing message to constructor to exception class constructor
        super(message);
    }
}
