import java.util.Scanner;

class Temperature {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Tempreature: ");
		double temp = scanner.nextDouble();

		if(temp < 5) {
			System.out.println("Wear a coat.");
		} else if(temp < 10) {
			System.out.println("Wear a jacket.");
		} else {
			System.out.println("Wear a shirt.");
		}
	}
}