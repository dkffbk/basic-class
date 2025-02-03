class Student {
	String name;
	int age;

	public void info() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

class OOP3 {
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();

		student1.name = "Alice";
		student1.age = 20;

		student2.name = "Bob";
		student2.age = 22;

		System.out.println("STUDENT-1");
		student1.info();

		System.out.println("STUDENT-2");
		student2.info();
	}
}