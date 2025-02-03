class Animal {
	public void makeSound() {
		System.out.println("Animals make different soumds.");
	}
}

class Dog extends Animal {
	@Override		//Parent class -> existing method
	public void makeSound() {
		System.out.println("Dog says: woof woof woof");	
	}
}

class Zoo {
	public static void main(String[] args) {
		Animal a;

		a = new Dog();
		a.makeSound()
;	}
}