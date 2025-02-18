//10. Bank Transaction System (Checked + Custom Exception)
//💡 Problem Statement:
//Develop a Bank Account System where:
//withdraw(double amount) method:
//Throws InsufficientBalanceException if withdrawal amount exceeds balance.
//Throws IllegalArgumentException if the amount is negative.
//Handle exceptions in main().
//Expected Behavior:
//        If valid, print "Withdrawal successful, new balance: X".
//If balance is not enough, throw and handle "Insufficient balance!"
//If the amount is negative, throw and handle "Invalid amount!"


package exceptionhandling.banktransactionsystem;

public class Main {
    public static void main(String[] args) throws InsufficientBalanceException {
        // creating a object of bank account
        BankAccount bankAccount = new BankAccount(9352, 10_000);

        // withdrawing amount which is less than the account balance
        bankAccount.withdraw(5_000);

        // trying to withdraw negative amount
        bankAccount.withdraw(-942);

        // trying to withdraw more amount than present in account
        bankAccount.withdraw(20_000);


    }
}
