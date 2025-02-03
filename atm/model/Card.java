package model;

public class Card extends BankAccount {
	private int cardNumber;
	private int pinNumber;
	
		public Card(String accountHolderName, int accountNumber, double balance, int cardNumber, int pinNumber) {
			super(accountHolderName, accountNumber, balance);
			this.cardNumber = cardNumber;
		this.pinNumber = pinNumber;
	}

	public boolean validatePinNumber(int pinNumber) {
		return this.pinNumber == pinNumber;
	}
}