class GrandFather {
	String grandProperty = "House";
}

class Father extends GrandFather {
	String fatherProperty = "Car";
}

class Son extends Father {
	String sonProperty = "Bike";
}

class Inheritance {
	public static void main(String[] args) {
		// Call to a default constructor
		Son son = new Son();

		System.out.println("Property");
		System.out.println("\tGrand Father: " + son.grandProperty);
		System.out.println("\tFather: " + son.fatherProperty);
		System.out.println("\tSon: " + son.sonProperty);
	}
}