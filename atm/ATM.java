import java.util.Scanner;
import model.Card;
// import model.BankAccount;
// import model.*;
import view.Menu;

class ATM {
	public static void main(String[] args) {
		boolean auth = false;
		Scanner scan = new Scanner(System.in);

		Card card = new Card("Winchester", 7342728, 1000, 2222, 123);

		int a = 1;
		do {
			System.out.print("Enter Your PIN Number: ");
			int inputPin = scan.nextInt();

			if (card.validatePinNumber(inputPin)) {
				auth = true;
				break;
			} else {
				if(a==3)
					System.out.println("Remove Your Card!");
				else 
					System.out.println("Invalid PIN! Please Try Again...");
			}

			a++;
		} while(a<=3);

		if(auth) {
			Menu menu = new Menu(card);
			menu.display();
		}

		scan.close();
	}
}