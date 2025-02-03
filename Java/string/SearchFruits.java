import java.util.Scanner;

class SearchFruits {

	static Scanner scanner = new Scanner(System.in);
	static String[] fruits = {
            "Apple", "Apricot", "Banana", "Blackberry", "Blueberry",
            "Cantaloupe", "Cherry", "Coconut", "Dragonfruit", "Fig",
            "Grapes", "Kiwi", "Lemon", "Lime", "Mango"
        };

	public static void main(String[] args) {
		System.out.println("FRUITS LIST");
		printFruits();

		System.out.print("Enter the fruit you want to find: ");
		String inputFruit = scanner.nextLine().toLowerCase();

		searchFruit(inputFruit);
	}

	public static void printFruits() {
		for (int a=0; a<fruits.length; a++) {
			System.out.println("\t" + fruits[a]);
		}
	}

	public static void searchFruit(String name) {

		int foundFruits = 0;
		int otherFruits = 0;

		for (int a=0; a<fruits.length; a++) {
			if (fruits[a].toLowerCase().startsWith(name)) {
				foundFruits++;
				fruits[a] = fruits[a] + "\t*";
			} else {
				otherFruits++;
			}
		}
		System.out.println("\n" + foundFruits + " Fruits start with " + " \"" + name.toUpperCase() + "\" found.");
		System.out.println(otherFruits + " other fruits found.");
		printFruits();
	}
}