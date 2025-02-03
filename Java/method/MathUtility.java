class MathUtility {
	public static void main(String[] args) {
		System.out.println("Built-in math class");
		System.out.println(Math.max(4, 2));

		System.out.println("\nCustomized Method");
		System.out.println(MathUtility.max(4, 2));
		System.out.println(MathUtility.min(4, 2));
		System.out.println(MathUtility.pow(4, 2));
	}

	//Maximum
	public static int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;	
	}
	//Minimum
	public static int min(int a, int b) {
		return (a > b) ? b : a;
	}
	//Power
	public static int pow(int base, int power) {
		int result = 1;

		for (int x = 1; x<=power; x++) {
			result *= base;
		}

		return result;
	}
}