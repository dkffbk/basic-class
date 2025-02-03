class Bank {
	private double balance;

	public double getBalance () {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}

class Encapsulation {
	public static void main(String[] args) {
		Bank bank = new Bank();

		System.out.print("Before update balance: ");
		System.out.println(bank.getBalance());

		System.out.print("After update balance: ");
		bank.setBalance(1000);
		System.out.println(bank.getBalance());
	}
}