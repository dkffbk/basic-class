class Person {
	String name;

	public void a() {
		System.out.println("a method");
	}
}

class OOP1 {
	public static void main(String[] args) {
		Person person = new Person();

		System.out.println(person.name);

		person.a();
	}
}