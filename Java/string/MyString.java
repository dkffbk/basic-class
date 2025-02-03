class MyString {
	public static void main(String[] args) {
		
		String msg = "Hello";

		System.out.println(msg);

		System.out.println("size: " + msg.length());
		System.out.println("upper: " + msg.toUpperCase());
		System.out.println("char: " + msg.charAt(0));
		System.out.println("equal: " + msg.equals("Hello"));
	}
}