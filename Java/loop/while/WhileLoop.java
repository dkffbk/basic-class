class WhileLoop {
	public static void main(String[] args) {
		/*
			1	init
			2	++
			3	cond
		*/

		int x=1;
		while(x<=3) {
			System.out.println("x: " + x);
			x++;
		}
		System.out.println("Last X: " + x);
	}
}