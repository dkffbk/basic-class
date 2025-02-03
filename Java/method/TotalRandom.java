import java.util.Scanner;

class TotalRandom {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter Array Size: ");
		int size = scan.nextInt();

		int[] arr = new int[size];

		for (int x=0; x<arr.length; x++) {
			/*
				Math.random()	  => 0 -> 1 (double)
				Math.random() * 5 => 0 -> 5 (double)
			*/
		 	arr[x] = (int)(Math.random() * 5);
		 }

		 for (int x=0; x<arr.length; x++) {
			System.out.println(arr[x]);
		 }
	}
}