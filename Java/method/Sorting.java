class Sorting {
	public static void main(String[] args) {
		int[] arr = {5, 2, 8};

		printArray(arr);
		System.out.println();

		System.out.println("Ascending Order...");
		asc(arr);
		System.out.println();
	}

	public static void printArray(int[] abc) {
		for (int x=0; x<abc.length; x++) {
			System.out.print(abc[x] + " ");
		}
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
		printArray(arr);
	}
}