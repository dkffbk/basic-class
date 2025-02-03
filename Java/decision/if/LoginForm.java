import java.util.Scanner;

class LoginForm {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//Database
		String dbName = "Paul";
		int dbPassord = 234;

		//Input
		String inputName = "Paul";
		int inputPassword = 234;

		if ( (dbName.equals(inputName)) && (dbPassword == inputPassword) ){
			System.out.println("Login Successful.");
		} else {
			System.out.println("Login Fail.");
		}
	}
}