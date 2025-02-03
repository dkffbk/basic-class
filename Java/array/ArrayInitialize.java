class ArrayInitialize {
	public static void main(String[] args) {
		
		// index 		0   1   2
		int[] marks = {38, 28, 100, 54, 89, 50};

		System.out.println("Array Length: " + marks.length);

		System.out.println("ASCENDING");
		for (int x=0;x<marks.length ;x++) {
			System.out.println(marks[x]);
		}
		
		System.out.println("\nDESCENDING");
		for (int y=(marks.length-1); y>=0; y--) {
			System.out.println(marks[y]);
		}
	}
}