class Type {
	// class/global
	static String staticVar = "static variable";
	String instanceVar = "instance variable";

	public static void main(String[] args) {
		String local = "local variable";

		// Class.staticVariable
		System.out.println(Type.staticVar);

		// Class.staticMethod()
		Type.a();

		Type obj = new Type();
		//object.instanceVariable
		System.out.println(obj.instanceVar);
		//object.instanceMethod()
		obj.b();
	}

	public static void a() {
		System.out.println("static method");
	}

	public void b() {
		System.out.println("Instance Method");
	}
}