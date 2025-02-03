import java.util.Scanner;

class NestedIf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Your Score: ");
		int score =scanner.nextInt();

		if( score >= 0 && score <= 100) {
			System.out.println("Your Score is Valid.");

			if(score >= 90)
				System.out.println("Grade A");
			else if(score >= 80)
				System.out.println("Grade B");
			else if(score >= 70)
				System.out.println("Grade C");
			else 
				System.out.println("Grade D");

		} else {
			System.out.println("Invalid Score!!!");
		}
	}
}