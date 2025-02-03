class MethodWithObjectParameter {
	public static void main(String[] args) {
		String[] cars = {"Ferrari", "BMW", "Volvo", "Ford", "Mercedes", "Hellcat"};
		System.out.println("CARS LIST");
		printCar(cars);

		System.out.println();
		printCar(new String[]{"Tesla", "BYD", "MG"});
	}

	public static void printCar(String[] cars) {
		for (int a=0; a<cars.length; a++) {
			System.out.println((a+1) + "- " + cars[a]);
		}
	}
}