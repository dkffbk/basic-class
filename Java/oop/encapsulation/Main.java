class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = (name!=null && !name.isEmpty()) ? name : "Unknown";
		this.age = (age>=10 && age<=50) ? age : 0;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		if(name!=null && !name.isEmpty())
			this.name = name;
		else 
			System.out.println("Invalid Name!");
	}

	public void setAge(int age) {
		if(age>=10 && age<=50)
			this.age = age;
		else
			System.out.println("Age must be between 10 and 50.");
	}
}

class Main {
	public static void main(String[] args) {
		Student student1 = new Student(null,8);

		System.out.println("STUDENT-1");
		System.out.println(student1.getName());
		System.out.println(student1.getAge());

		Student student2 = new Student("John Doe",18);

		System.out.println("STUDENT-2");
		System.out.println(student2.getName());
		System.out.println(student2.getAge());

		Student student3 = new Student("Dean Winchester", 27);

		System.out.println("STUDENT-3");
		System.out.println("Before update name: " + student3.getName());

		student3.setName("Sam Winchester");
		System.out.println("After update name: " + student3.getName());
	}
}