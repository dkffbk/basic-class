import java.util.Scanner;

class ScannerInput{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Your Name: ");
		String userName = scan.nextLine();

		System.out.println("Hello, " + userName);

		System.out.print("Enter Your Age: ");
		int age = scan.nextInt();

		System.out.println("Age: " + age);
	}
}