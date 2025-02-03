class Student {
	String name;
	int age;

	public Student() {
		this("Unknow", 0);
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println("\tName: " + this.name);
		System.out.println("\tAge: " + this.age);
	}
}

class MainStudent{
	public static void main(String[] args) {
		Student student1 = new Student("Dean Winchester", 27);
		Student student2 = new Student();
		Student student3 = new Student("Sam Winchester", 22);

		Student[] students = {student1, student2, student3}; // Object Array
		// students[0] == student1

		for (int i=0; i<students.length; i++) {
			System.out.println("STUDENT-" + (i+1));
			students[i].display();
		}
	}
}