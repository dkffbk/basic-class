import java.util.Scanner;

class IfElse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter First Number: ");
		int a = scanner.nextInt();

		System.out.print("Enter Second Number: ");
		int b = scanner.nextInt();

		if(a > b) {
			System.out.println(a + " is greater than " + b);
		} else if(a < b) {
			System.out.println(a + " is less than " + b);
		} else {
			System.out.println(a + " is equal to " + b);
		}
	}
}