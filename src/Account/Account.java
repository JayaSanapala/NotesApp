package Account;

import java.util.ArrayList;
import java.util.Date;
public class Account {
	    private String accountHolder;
	    private double balance;
	    private ArrayList<String> transactionHistory;

	    public Account(String accountHolder) {
	        this.accountHolder = accountHolder;
	        this.balance = 0.0;
	        this.transactionHistory = new ArrayList<>();
	        transactionHistory.add("Account created for " + accountHolder + " on " + new Date());
	    }

	    public void deposit(double amount) {
	        if (amount <= 0) {
	            System.out.println("Amount must be positive.");
	            return;
	        }
	        balance += amount;
	        transactionHistory.add("Deposited: $" + amount + " on " + new Date());
	        System.out.println("Deposit successful.");
	    }

	    public void withdraw(double amount) {
	        if (amount <= 0) {
	            System.out.println("Amount must be positive.");
	            return;
	        }
	        if (amount > balance) {
	            System.out.println("Insufficient balance.");
	            return;
	        }
	        balance -= amount;
	        transactionHistory.add("Withdrew: $" + amount + " on " + new Date());
	        System.out.println("Withdrawal successful.");
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void printTransactionHistory() {
	        System.out.println("\n--- Transaction History ---");
	        for (String record : transactionHistory) {
	            System.out.println(record);
	        }
	    }
	}


