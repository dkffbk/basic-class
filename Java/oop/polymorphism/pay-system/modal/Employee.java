package modal;

public class Employee {
	private int empID;
	private String name;

	public Employee(int empID, String name) {
		this.empID = empID;
		this.name = name;
	}

	public int getEmpID() {
		return this.empID;
	}
	public String getName() {
		return this.name;
	}
}