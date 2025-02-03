class FruitList {
	public static void main(String[] args) {
		
		String[] fruits = new String[4];

		fruits[0] = "Apple";
		fruits[1] = "Orange";
		fruits[2] = "Avocado";
		fruits[3] = "Kiwi";

		System.out.println("FRUIT LIST");
		for (int x=0; x<4; x++) {
			System.out.println("\tfruits[" + x + "]: " + fruits[x]);
		}

		System.out.println("\nDescending Fruit List: ");
		for (int x=3; x>=0; x--) {
			System.out.println("\tfruits[" + x + "]: " + fruits[x]);
		}
	}
}