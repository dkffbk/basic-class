class MethodWithParameter {
	public static void main(String[] args) {
		//					(arguments)
		System.out.println("ADD: " + add(5,20));

		System.out.println("HERO-1");
		hero("Miya", 'M', 42);

	}

	//				parameters (local variable)
	public static int add(int a, int b) {
		return a+b;
	}

	public static void hero(String name, char role, int level) {
		System.out.println("\tName: " + name);
		System.out.println("\tRole: " + role);
		System.out.println("\tLevel: " + level);
	}
}