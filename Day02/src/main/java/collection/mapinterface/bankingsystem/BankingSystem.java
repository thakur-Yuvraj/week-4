package collection.mapinterface.bankingsystem;

import java.util.*;

public class BankingSystem {
    //HashMap stores customer accounts (AccountNumber -> Balance).
    private HashMap<Integer, Integer> accounts;

    //TreeMap sorts customers by balance.
    private Map<Integer, Integer> balance;

    // Queue processes withdrawal requests.
    private Queue<WithdrawRequest> queue;

    BankingSystem() {
        accounts = new HashMap<>();
        balance = new TreeMap<>();
        queue = new LinkedList<>();

    }

    // adding account to system
    public void addAccount(Integer accountNumber, Integer balance) {
        accounts.put(accountNumber, balance);
        this.balance.put(balance, accountNumber);
    }

    // inner class withdraw
    private class WithdrawRequest {
        Integer accountNumber;
        Integer withdrawAmount;
        WithdrawRequest(Integer accountNumber, Integer withdrawAmount) {
            this.withdrawAmount = withdrawAmount;
            this.accountNumber = accountNumber;
        }
    }
    // request withdraw
    public void requestWithdraw(Integer accountNumber, Integer withdrawAmount) {
        if (accounts.containsKey(accountNumber)) {
            queue.add(new WithdrawRequest(accountNumber, withdrawAmount));
            return;
        }
        System.out.println("Account not exist");
    }

    // process the request
    public void processRequest() {
        while(!queue.isEmpty()) {
            WithdrawRequest request = queue.poll();
            if (accounts.get(request.accountNumber) < request.withdrawAmount) {
                System.out.println("Insufficient balance");
                return;
            }
            accounts.put(request.accountNumber, accounts.get(request.accountNumber) - request.withdrawAmount);
            System.out.println("Withdraw successful");
        }
    }

    // Method to display all accounts sorted by balance
    public void displayAccountsSortedByBalance() {
        for (Map.Entry<Integer, Integer> entry : balance.entrySet()) {
            System.out.println("Account: " + entry.getValue() + ", Balance: " + entry.getKey());
        }
    }
}
