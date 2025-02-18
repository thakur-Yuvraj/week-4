package exceptionhandling.banktransactionsystem;


public class BankAccount {
    private int accountNumber;
    private double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Custom Exception for Insufficient Balance
    public void withdraw(double withdrawAmount) throws InsufficientBalanceException {
        if (withdrawAmount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if (withdrawAmount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance -= withdrawAmount;
        System.out.println("Withdraw successfully");
    }
}
