import java.util.Scanner;

class SearchName {
	static Scanner input = new Scanner(System.in);
	static String[] users = {
		"Alice",
		"Alton",
		"Bob",
		"Charlie"
	};

	public static void main(String[] args) {
		System.out.println("USER LIST");
		printUserName();

		System.out.print("Enter the name you want to find: ");
		String inputName = input.nextLine();

		if(searchName(inputName))
			System.out.println( "\"" + inputName.toUpperCase() + "\" is found.");

			System.out.println("\"" + inputName.toUpperCase() + "\" is not found.");
	}

	public static void printUserName() {
		for (int x=0; x<users.length; x++)
			System.out.println("\t" + (x+1) + ". " + users[x]);

		System.out.print("\n");
	}

	public static boolean searchName(String name) {
		boolean isUserFound = false;

		for (int a=0; a<users.length; a++) {
			if(users[a].equalsIgnoreCase(name)) {
				isUserFound = true;
				break;
			}
		}

		return isUserFound;
	}

}