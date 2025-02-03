class MethodWithReturnValue {
	public static void main(String[] args) {
		boolean temp = loveMe();

		// System.out.println(temp);

		if (loveMe()) {
			System.out.println("Happy");
		} else {
			System.out.println("Cry");
		}
	}

	public static boolean loveMe() {
		System.out.println("???????");

		return true;
	}
}