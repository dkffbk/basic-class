import modal.Employee;
import modal.PayRoll;

public class Payment {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Dean");
		Employee emp2 = new Employee(2, "Sam");

		PayRoll pay = new PayRoll();

		System.out.println("EMPLOYEE-1: FULL TIME");
		pay.paySalary(emp1, 4000);

		System.out.println("EMPLOYEE-2: PART TIME");
		pay.paySalary(emp2, 3000, 20, 85.5);

		System.out.println("EMPLOYEE-3: PART TIME");
		pay.paySalary(new Employee(3, "John"), 3000, 40, 75.5);
	}
}