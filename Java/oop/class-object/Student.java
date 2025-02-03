class Student {
	// attribute/property/state/field/variable
	String name;
	int rollNumber;
	char grade;

	//constructor
	public Student(String a, int b, char c) {
		name = a;
		rollNumber = b;
		grade = c;
	}

	//behavior/method
	public void info() {
		System.out.println("\tName: " + name);
		System.out.println("\tRoll Number: " + rollNumber);
		System.out.println("\tGrade: " + grade);
	}

	public static void main(String[] args) {
		// Call to a three-argument constructor
		Student student =new Student("John Doe", 7, 'B');

		System.out.println("STUDENT");
		student.info();
	}
}