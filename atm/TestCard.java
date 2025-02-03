import model.Card;

public class TestCard {
	public static void main(String[] args) {
		Card card = new Card("Winchester", 765, 100_000, 2222, 123);

		if(card.validatePinNumber(123))
			System.out.println("Login Success...");
		else
			System.out.println("Incorrect!!");
	}
}