import junit.basic.bankaccount.BankAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testInitialBalance() {
        BankAccount account = new BankAccount();
        assertEquals(0.0, account.getBalance(), "Initial balance should be 0.0.");
    }

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), "Balance should be 100.0 after deposit.");
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount();
        account.deposit(100.0);
        account.withdraw(50.0);
        assertEquals(50.0, account.getBalance(), "Balance should be 50.0 after withdrawal.");
    }

    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount();
        account.deposit(50.0);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(100.0);
        });

        String expectedMessage = "Insufficient funds.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage), "Withdrawal should fail due to insufficient funds.");
    }

    @Test
    void testDepositNegativeAmount() {
        BankAccount account = new BankAccount();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-50.0);
        });

        String expectedMessage = "Deposit amount must be positive.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage), "Deposit should fail for negative amounts.");
    }

    @Test
    void testWithdrawNegativeAmount() {
        BankAccount account = new BankAccount();
        account.deposit(100.0);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-50.0);
        });

        String expectedMessage = "Withdrawal amount must be positive.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage), "Withdrawal should fail for negative amounts.");
    }
}