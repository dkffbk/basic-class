class NestedLoop {
	public static void main(String[] args) {
		for (int x=1;x<=10 ;x++ ) {
			for (int y=1; y<=12; y++) {
				System.out.println(x + " * " + y + " = " + (x*y));
			}
			System.out.print("\n");
		}
	}
}