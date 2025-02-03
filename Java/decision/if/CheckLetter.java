import java.util.Scanner;

class CheckLetter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a Character: ");
		char letter = scan.next().charAt(0);

		if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
			System.out.println(letter + " is a Vowel.");
		} else {
			System.out.println(letter + " is a Consenant.");
		}
	}
}