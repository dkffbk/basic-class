public class InstanceVariable {
	int c;
	public void addition() {
		int a=10, b=20;
		c = a+b;
		System.out.println("Sun of a and b is " + c + ".");
	}
	public static void main(String[] args) {
		InstanceVariable insVar = new InstanceVariable();
		insVar.addition();
	}
}