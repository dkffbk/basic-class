import java.util.Scanner;

class ArithmeticScanner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter First Number: ");
		double a = s.nextDouble();

		System.out.print("Enter Second Number: ");
		double b = s.nextDouble();

		double add = (a + b);
		double sub = (a - b);
		double mul = (a * b);
		double div = (a / b);
		double mod = (a % b); 

		System.out.println("add: " + add);
		System.out.println("sub: " + sub);
		System.out.println("mul: " + mul);
		System.out.println("div: " + div);
		System.out.println("mod: " + mod); 
	}
}