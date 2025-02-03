import java.util.Scanner;

class MarryMe {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Do you love me? ");
		String love = scan.next().toLowerCase();

		if(love.equals("yes")) {
			System.out.println("\n\tHappy\n");

			System.out.print("\n\tMarry me? \n");
			String marry = scan.next().toLowerCase();

			switch(marry) {
				case "yes":
					System.out.println("\n\tI'm so happpy. Let's get married\n");
					break;

				case "no":
					System.out.println("\n\tOh...no. Why Not?\n");
					break;

				default:
					System.out.println("\n\tPlease answer with \"yes\" or \"no\"!!\n");
			}

		} else if(love.equals("no")) {
			System.out.println("\n\tJust be friend\n");
		} else {
			System.out.println("\n\tPlease answer with \"yes\" or \"no\"!!\n");
		}
	}
}