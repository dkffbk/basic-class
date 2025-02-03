import java.util.Scanner;

class Caculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter First Number: ");
		int a = scan.nextInt();

		System.out.print("Enter Second Number: ");
		int b = scan.nextInt();

		System.out.print("Choose an operator[+, -, *, /]: ");
		char operator = scan.next().charAt(0);

		int result = 0;

		switch(operator) {
			case '+': result = add(a, b); break;
			case '-': result = sub(a, b); break;
			case '*': result = mul(a, b); break;
			case '/': result = div(a, b); break;
			default: System.out.println("Invalid Operator!!");
		}

		System.out.println("RESULT: " + result);
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int mul(int a, int b) {
		return a * b;
	}

	public static int div(int a, int b) {
		return a / b;
	}

}