package model;

public class BankAccount {
	protected String accountHolderName;
	protected int accountNumber;
	protected double balance;

	public BankAccount(String accountHolderName, int accountNumber, double balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		} else {
			return false;
		}
	}
	public boolean withdraw(double amount) {
		if (amount>0 && amount<=balance) {
			balance -= amount;
			return true;
		}

		return false;
	}
}