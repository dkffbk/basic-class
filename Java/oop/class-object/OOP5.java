class Student {
	String name;

	public Student() {
		this("Unknow");		// Using "this" to refer to constructor
	}

	public Student(String name) {
		this.name = name; 	//Using "this" to refert to instancenvariable
	}
}

class OOP5 {
	public static void main(String[] args) {
		Student student1 = new Student();
		System.out.println(student1.name);

		Student student2 = new Student("John Winchester");
		System.out.println(student2.name);
	}
}