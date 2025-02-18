package exceptionhandling.banktransactionsystem;

// Custom Exception for Insufficient Balance
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
