class Product {
	int id;
	String name;
	boolean inStock;

	public Product(int id, String name, boolean inStock) {
		this.id = id;
		this.name = name;
		this.inStock = inStock;
	}

	public void info() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Instock: " + inStock);
	}
}

class MethodWithObject {
	public static void main(String[] args) {
		Product product1 = new Product(007, "laptop", true);
		System.out.println("PRODUCT-1");
		printProduct(product1);

		System.out.println();

		System.out.println("PRODUCT-2");
		printProduct(new Product(200, "Mouse", false));
	}

	public static void printProduct(Product p) {
		p.info();
	}	
}