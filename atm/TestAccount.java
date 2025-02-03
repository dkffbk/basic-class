import model.BankAccount;

class TestAccount {
	public static void main(String[] args) {
		BankAccount acc = new BankAccount("John Winchester", 7347, 100000);

		if(acc.withdraw(50000))
			System.out.println("Success Withdraw...");
		else
			System.out.println("Fail Withdraw!!");

		System.out.println("Before update balance..");
		System.out.println(acc.getBalance());

		boolean result = acc.deposit(20000);
		if(result)
			System.out.println("Success");
		else
			System.out.println("Fail!");

		System.out.println("After update balance..");
		System.out.println(acc.getBalance());
	}
}