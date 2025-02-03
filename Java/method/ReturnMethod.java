class ReturnMethod {
	public static void main(String[] args) {
		System.out.println(getMessage());

		System.out.println("add: " + add());
	}

	public static String getMessage() {
		String msg = "hello";

		return msg;
	}

	public static double add() {
		System.out.println("a: 5.5");
		System.out.println("b: 10.5");

		double add = 5.5 + 10.5;

		return add;
	}

}