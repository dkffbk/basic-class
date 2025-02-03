class BankAccount {
	protected String accountHolderName;
	protected double balance;

	public BankAccount(String accountHolderName, double balance) {
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public void caculateInterestRate() {
		System.out.println("Bank Account: Caculating interest rate...");
	}
}

class SavingAccount extends BankAccount {
	private double interestRate;

	public SavingAccount(String accountHolderName, double balance, double interestRate) {
		super(accountHolderName, balance);
		this.interestRate = interestRate;
	}

	public void caculateInterestRate() {
		double interest = balance * (interestRate/100);

		System.out.println("\tSaving Account Holder Name: " + accountHolderName);
		System.out.println("\tBalance: $" + balance);
		System.out.println("\tInterest Rate: " + interestRate + "%");
		System.out.println("\tTotal Balance: $" + (balance+interest));
	}
}

class CurrentAccount extends BankAccount {
	private double transactionFee;

	public CurrentAccount(String accountHolderName, double balance, double transactionFee) {
		super(accountHolderName, balance);
		this.transactionFee = transactionFee;
	}

	public void caculateInterestRate() {
		System.out.println("\tCurrent Account Holder Name: " + accountHolderName);
		System.out.println("\tBalance: $" + balance);
		System.out.println("\tCurrent Account has no interest rate but a transaction fee $" + transactionFee);
		System.out.println("\tTotal Balance: $" + (balance-transactionFee));
	}

}

class MainBank {
	public static void main(String[] args) {
		SavingAccount saving = new SavingAccount("Dean Winchester", 100_000, 10);
		CurrentAccount current = new CurrentAccount("Sam Winchester", 100_000, 3000);

		System.out.println("SAVING ACCOUNT");
		saving.caculateInterestRate();

		System.out.println("\nCURRENT ACCOUNT");
		current.caculateInterestRate();
	}
}