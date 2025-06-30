package Account;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter account holder name: ");
		        String name = scanner.nextLine();
		        Account account = new Account(name);

		        boolean running = true;

		        while (running) {
		            System.out.println("\n--- Bank Menu ---");
		            System.out.println("1. Deposit");
		            System.out.println("2. Withdraw");
		            System.out.println("3. Check Balance");
		            System.out.println("4. Transaction History");
		            System.out.println("5. Exit");
		            System.out.print("Choose option: ");
		            int option = scanner.nextInt();

		            switch (option) {
		                case 1:
		                    System.out.print("Enter amount to deposit: ");
		                    double depositAmount = scanner.nextDouble();
		                    account.deposit(depositAmount);
		                    break;
		                case 2:
		                    System.out.print("Enter amount to withdraw: ");
		                    double withdrawAmount = scanner.nextDouble();
		                    account.withdraw(withdrawAmount);
		                    break;
		                case 3:
		                    System.out.println("Current balance: $" + account.getBalance());
		                    break;
		                case 4:
		                    account.printTransactionHistory();
		                    break;
		                case 5:
		                    running = false;
		                    System.out.println("Thank you for banking with us!");
		                    break;
		                default:
		                    System.out.println("Invalid option.");
		            }
		        }

		        scanner.close();

	}

}
