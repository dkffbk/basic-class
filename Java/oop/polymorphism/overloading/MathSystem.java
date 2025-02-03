class Math {
	/*
		Same class
		Same method name
		Different parameters
	*/
	public static void add(int a, int b) {
		System.out.println("INT: " + (a+b));
	}

	public static void add(float a, float b) {
		System.out.println("FLOAT: " + (a+b));
	}
}

class MathSystem {
	public static void main(String[] args) {
		Math.add(7,14);
		Math.add(4.8f,7);
	}
}