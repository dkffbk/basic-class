class TwoDimensionalArray {
	public static void main(String[] args) {

		int [][] two = new int[2][3];

		// System.out.println(two.length);
		// System.out.println(two[0].length);
		// System.out.println(two[1].length);

		two[0][0] = 30;
		two[0][1] = 40;
		two[0][2] = 50;

		two[1][0] = 60;
		two[1][1] = 70;
		two[1][2] = 80;

		for (int x=0; x<two.length; x++) {
			for (int y=0; y<two[x].length; y++) {
				System.out.println("two[" + x +"]" + "[" + y + "] : " + two[x][y]);
			}
			System.out.println();
		}
	}
}