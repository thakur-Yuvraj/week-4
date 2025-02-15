package junit.basic.bankaccount;

public class BankAccount {

    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    // Adds money to the balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
    }

    // Reduces balance
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        if (amount > 0) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
    }

    // Returns the current balance
    public double getBalance() {
        return balance;
    }
}