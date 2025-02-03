import java.util.Scanner;

class NoReturnValue {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("MENU");
		System.out.println("A- Coffee");
		System.out.println("B- Beer");
		System.out.print("\nChoose an option: ");
		char option = scan.next().charAt(0);

		switch(option) {
			case 'a': coffee(); break;
			case 'b': beer(); break;
			default: System.out.println("Invalid Option!");
		}
	}

	public static void coffee() {
		System.out.println("1- Expresso");
		System.out.println("2- Latte");
		System.out.println("3- Americano");
	}

	public static void beer() {
		System.out.println("1- ABC");
		System.out.println("2- Tiger");
		System.out.println("3- Heineken");
	}

}