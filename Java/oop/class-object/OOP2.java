class Student {
	String name;
	int age;
}

class OOP2 {
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();

		student1.name = "Alice";
		student1.age = 20;
		student2.name = "Bob";
		student2.age = 22;
		
		System.out.println("Student-1");
		System.out.println(student1.name);
		System.out.println(student1.age);

		System.out.println("Student-2");
		System.out.println(student2.name);
		System.out.println(student2.age);
	}
}