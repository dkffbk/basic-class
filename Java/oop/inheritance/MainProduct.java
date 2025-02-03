class Product {
	int id;
	double price;

	public Product(int id, double price) {
		this.id = id;
		this.price = price;
	}

	public String display() {
		return "ID: " + id +
				"\nPrice: $" + price;
	}
}

class Clothing extends Product {
	String type;
	String material;
	char size;

	public Clothing(int id, double price, String type, String material, char size) {
		super(id, price);

		this.type = type;
		this.material = material;
		this.size = size;
	}

	public String display() {
		// call to parent's method
		return super.display() +
				"\nType: " + type +
				"\nMaterial: " + material +
				"\nSize: " + size;
	}
}

class MainProduct {
	public static void main(String[] args) {
		Product product = new Product(1, 100);

		System.out.println("PRODUCT");
		System.out.println( product.display() );

		Clothing clothing1 = new Clothing(2, 200, "T-Shirt", "Cotton", 'M');
		System.out.println("\nSHIRT");
		System.out.println(clothing1.display());

		Clothing clothing2 = new Clothing(3, 300, "Jean", "Leather", 'L');
		System.out.println(clothing2.display());

		Clothing clothing3 = new Clothing(4, 400, "Pant", "Linen", 'S');
		System.out.println(clothing3.display());

		System.out.println("===================");

		// Class type -> parent
		// object -> child's pbject
		Product[] products = {product, clothing1, clothing2, clothing3};

		// System.out.println(products[2].display());

		for (int x=0; x<products.length; x++) {
			System.out.println("\n" + products[x].display());
		}
	}
}