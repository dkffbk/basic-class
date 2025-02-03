abstract class Vehicle {
	public abstract void move();
}

class Car extends Vehicle {
	//implementation
	public void move() {
		System.out.println("Car is driving on the road.");
	}
}

class Abstration {
	public static void main(String[] args) {
		Car car = new Car();
		car.move();
	}
}