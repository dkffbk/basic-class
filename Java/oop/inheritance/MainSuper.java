// parent/super/base class
class A {
	public A() {
		System.out.println("A consturctor");
	}
}

// child/derived/sub class
class B extends A {
	public B() {
		System.out.println("B constructor");
	}
}

class Parent {
	public Parent(String a) {
		System.out.println("Parent: " + a);
	}
}

class Child extends Parent {
	public Child(int a, String b) {
		super(b); 	// Call to a parent's constructor

		System.out.println("Child: " + a);
	}
}

class MainSuper {
	public static void main(String[] args) {
		// B b = new B();

		Child child = new Child(20, "Hello");
	}
}