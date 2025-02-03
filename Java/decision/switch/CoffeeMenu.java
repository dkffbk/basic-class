import java.util.Scanner;

class CoffeeMenu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Coffee Menu");
		System.out.println("1- Americano");
		System.out.println("2- Expresso");
		System.out.println("3- Mocha");
		System.out.println("4- Latte");

		System.out.println("Choose an option[1-4]");
		int action = scan.nextInt();

		switch(action) {
			case 1:
				System.out.println("You selected: ");
				System.out.println("\tAMERICANO $10");
				break;

			case 2:
				System.out.println("You selected: ");
				System.out.println("\tEXPRESSO $9");
				break;
			case 3:
				System.out.println("You selected: ");
				System.out.println("\tMOCHA $7.50");
				break;

			case 4:
				System.out.println("You selected: ");
				System.out.println("\tLATTE $6.85");
				break;

			default:
				System.out.println("Invalid Action!!");
		}
	}
}