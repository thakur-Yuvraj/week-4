//Implement a Banking System
//Description:
//HashMap stores customer accounts (AccountNumber -> Balance).
//TreeMap sorts customers by balance.
//Queue processes withdrawal requests.

package collection.mapinterface.bankingsystem;

public class Main {
    public static void main(String[] args) {
        // creating object of banking system
        BankingSystem bankingSystem = new BankingSystem();

        // adding account to system
        bankingSystem.addAccount(4, 10_000);
        bankingSystem.addAccount(49, 15_000);
        bankingSystem.addAccount(456, 20_000);
        bankingSystem.addAccount(4124, 30_000);
        bankingSystem.addAccount(6779, 80_000);

        // printing the account sorted by balance
        bankingSystem.displayAccountsSortedByBalance();

        // requesting for withdraw
        bankingSystem.requestWithdraw(4, 5_000);

        // this account is not in system
        bankingSystem.requestWithdraw(2, 5_000);

        // will not process
        bankingSystem.requestWithdraw(456, 25_000);

        bankingSystem.processRequest();
    }
}
