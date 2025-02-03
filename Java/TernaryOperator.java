public class TernaryOperator {
	public static void main(String[] args) {
		int firstNum = 10, secondNum;
		secondNum = (firstNum==1) ? 20 : 30;
		System.out.println("Value of secondNum is " + secondNum);
		secondNum = (firstNum==10) ? 20 : 30;
		System.out.println("Value of secondNum is " + secondNum);

		// int a = 4;
		// int b = 2;
		// int max = (a > b) ? a : b;

		int age = 18;
		boolean checkAge = (age >= 18) ? true : false;

		if (checkAge)
			System.out.println("Access granted.");
		else
			System.out.println("Access denied!");
		
	}
}