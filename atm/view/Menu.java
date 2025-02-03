package view;

import model.Card;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Menu {
	private Card card;
	private Scanner scan;
	private double transaction;
	private ArrayList<String> transactionTypes = new ArrayList<String>();
	private ArrayList<Double> transactionAmounts = new ArrayList<Double>();
	private ArrayList<String> transactionTimes = new ArrayList<String>();
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");

	public Menu(Card card) {
		this.card = card;
		this.scan = new Scanner(System.in);
	}

	public void display() {
		boolean exit = false;

		do {
			System.out.println("ATM MENU");
			System.out.println("\t1. Check Balance");
			System.out.println("\t2. Deposit");
			System.out.println("\t3. Withdraw");
			System.out.println("\t4. Previous Transaction");
			System.out.println("\t5. Print");
			System.out.println("\t6. Exit");

			System.out.print("Choose an option: ");
			int action = scan.nextInt();
			line();
			switch(action) {
				case 1: balance(); break;
				case 2: deposit(); break;
				case 3: withdraw(); break;
				case 4: transaction(); break;
				case 5: print(); break;
				case 6: exit = true; exit(); break;
				default: System.out.println("Invalid Option!!");
			}
			line();
		} while(!exit);
	}

	public void balance() {
		System.out.printf("Current Balance: $%.0f\n", card.getBalance());
	}

	public void deposit() {
		System.out.print("Enter amount to deposit: $");
		double amount = scan.nextDouble();

		line();
		if (card.deposit(amount)) {
			System.out.println("Successfully Deposit: $" + amount);
			balance();
			transaction = amount;
			transactionTypes.add("Deposit");
			transactionAmounts.add(amount);
			transactionTimes.add(LocalDateTime.now().format(formatter));
		} else {
			System.out.println("Deposit Failed!");
		}
	}

	public void withdraw() {
		System.out.print("Enter amount to Withdraw: $");
		double amount = scan.nextDouble();

		line();
		if (card.withdraw(amount)) {
			System.out.println("Successfully Withdraw: $" + amount);
			balance();
			transaction = -amount;
			transactionTypes.add("Withdraw");
			transactionAmounts.add(-amount);
			transactionTimes.add(LocalDateTime.now().format(formatter));
		} else {
			System.out.println("Withdraw Failed!");
		}
	}

	public void transaction() {
		if(transaction > 0)
			System.out.println("Deposit: $+" + transaction);
		else if(transaction < 0)
			System.out.println("Withdraw: $" + transaction);
		else
			System.out.println("No Transaction!");
	}

	public void print() {
		try {
			FileWriter file = new FileWriter("transactions.txt");

			if (transactionTypes.size() > 0) {
				file.write(String.format("%-7s%-21s%-20s%s\n", "No", "TRANSACTION TYPE", "AMOUNT", "TRANSACTION TIME"));

				System.out.printf("%-7s%-21s%-20s%s\n", "No", "TRANSACTION TYPE", "AMOUNT", "TRANSACTION TIME");
				for (int a = 0; a < transactionTypes.size(); a++) {
					String amountString = transactionTypes.get(a).equals("Deposit") ? "+" + transactionAmounts.get(a) : String.valueOf(transactionAmounts.get(a));
					file.write(String.format("%-10s%-17s%-20s%s\n", (a+1), transactionTypes.get(a), amountString, transactionTimes.get(a)));
				
					System.out.printf("%-10s%-17s%-20s%s\n", (a+1), transactionTypes.get(a), amountString, transactionTimes.get(a));
				}
			} else {
				System.out.println("No Transactions!");
				file.write("NO TRANSACTION RECORDS!!");
			}
			file.close();
		} catch(IOException e) {
			System.out.println("An error occoured: " + e);
		}
	}

	public void exit() {
		System.out.println("Thanks for using our system...");
	}

	public void line() {
		for (int a=0; a<=35; a++) {
			System.out.print("==");
		}
		System.out.print("\n");
	}
}