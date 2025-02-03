abstract class Shape {
	protected double area;

	public abstract void calculateArea();
}

class Circle extends Shape {
	//constant --> UPPER_CASE
	private final double PI = Math.PI;

	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public void calculateArea() {
		area = PI * radius * radius;

		System.out.printf("Circle area: %.2f", area);
	}
}

class Area {
	public static void main(String[] args) {
		Circle circle = new Circle(7);
		circle.calculateArea();
	}
}