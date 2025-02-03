import java.util.Scanner;

class LoginScanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//Database
		String dbName = "Paul";
		int dbPassword = 234;

		//Input
		System.out.print("Enter Username: ");
		String inputName = scan.nextLine();

		System.out.print("Enter Your Password: ");
		int inputPassword = scan.nextInt();

		//Database == UserInput
		if ( (dbName.equals(inputName)) && (dbPassword == inputPassword) ){
			System.out.println("Login Successful.");
		} else {
			System.out.println("Login Fail.");
		}
	}
}