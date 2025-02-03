package modal;

public class PayRoll {
	public void paySalary(Employee emp, double baseSalary) {
		System.out.println("\tEMP ID: " + emp.getEmpID());
		System.out.println("\tName: " + emp.getName());
		System.out.println("\tTotal Salary: $" + baseSalary);
	}
	public void paySalary(Employee emp, double baseSalary, int overtime, double hourlyRate) {
		double totalSalary = baseSalary + (overtime*hourlyRate);

		System.out.println("\tEMP ID: " + emp.getEmpID());
		System.out.println("\tName: " + emp.getName());
		System.out.println("\tBase Salary: $" + baseSalary);
		System.out.println("\tOvertime: " + overtime + "hours");
		System.out.println("\tHourly Rate: $" + hourlyRate);
		System.out.println("\tTotal Salary: $" + totalSalary);
	}
}