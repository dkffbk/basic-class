class Student {
	public Student() {
		System.out.println("no-argument constructor");
	}

	public Student(int a) {
		System.out.println("one-argument constructor");
	}
}

class OOP4 {
	public static void main(String[] args) {
		// Call to no-argument constructor
		Student student1 = new Student();

		// Call to one-argument constructor
		Student student2 = new Student(10);
	}
}