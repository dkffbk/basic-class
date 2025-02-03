import java.util.Scanner;

class MathMethod {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean exit = false;

		System.out.print("Enter Array Size: ");
		int size = scan.nextInt();

		int[] arr = new int[size];

		for (int x=0; x<arr.length; x++) {
			arr[x] = (int) (Math.random() * 10);
		}

		printArr(arr);
		System.out.println("\nChoose an option:");
		System.out.println("1 - MIN");
		System.out.println("2 - MAX");
		System.out.println("3 - TOTAL");
		System.out.println("4 - ASCENDING ORDER (0-9)");
		System.out.println("5 - DESENDING ORDER (9-0)");
		System.out.println("6 - EXIT");


		while(!exit){			
			
			System.out.print("Enter your choice: ");
			int choice = scan.nextInt();

			if (choice == 6) {
				exit = true;
				exit();
			} else if(choice >= 1 && choice <= 5) {
				switch(choice) {
					case 1: min(arr); break;
					case 2: max(arr); break;
					case 3: total(arr); break;
					case 4: asc(arr); break;
					case 5: desc(arr); break;
				}
			} else {
				System.out.println("Invalid Choice!");
			}
		}

	}

	public static void printArr(int[] arr) {
		for (int x=0; x<arr.length; x++) {
			System.out.print(arr[x] + "\t");
		}
		System.out.print("\n");
	}

	public static void exit() {
		System.out.println("\n\tExiting System.\n");
	}

	public static void min(int[] arr) {
		int min = arr[0];
		for (int x = 1; x<arr.length; x++) {
			if (min > arr[x]) {
				min = arr[x];
			}
		}
		System.out.println("\n\tMIN: " + min + "\n");
	}

	public static void max(int[] arr) {
		int maxx = arr[0];
		for (int x = 1; x<arr.length; x++) {
			if (maxx < arr[x]) {
				maxx = arr[x];
			}
		}
		System.out.println("\n\tMAX: " + maxx + "\n");
	}

	public static void total(int[] arr) {
		int total = 0;

		for (int a=0; a<arr.length; a++) {
			total += arr[a];
		}
		System.out.println("\n\tTOTAL: " + total + "\n");
	}

	public static void asc(int[] arr) {
		for (int a=0; a<arr.length; a++) {
			for (int b=a+1; b<arr.length; b++) {
				int temp = 0;

				if (arr[b] < arr[a]) {
					temp = arr[a];
					arr[a] = arr[b];
					arr[b] = temp;
				}
			}
		}
		System.out.print("\nASCENDING ORDER: ");
		printArr(arr);
		System.out.println();
	}

	public static void desc(int[] arr) {
		for (int a=0; a<arr.length; a++) {
			for (int b=a+1; b<arr.length; b++) {
				int temp = 0;

				if (arr[b] > arr[a]) {
					temp = arr[a];
					arr[a] = arr[b];
					arr[b] = temp;
				}
			}
		}
		System.out.print("\nDESCENDING ORDER: ");
		printArr(arr);
		System.out.println();
	}
}