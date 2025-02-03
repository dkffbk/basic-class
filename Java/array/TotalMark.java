import java.util.Scanner;

class TotalMark {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("\nEnter Total Number of Subjects: ");
		int numberOfSubs = scan.nextInt();

		int[] marks = new int[numberOfSubs];

		int totalMark = 0;

		for (int x=0; x<marks.length; x++) {
			System.out.print("Subject-" + (x+1) + ": ");
			marks[x] = scan.nextInt();

			totalMark += marks[x];
		}

		System.out.println("\nRESULTS");

		for(int x=0; x<marks.length; x++) {
			System.out.println("Subject-" + (x+1) + ": " + marks[x]);
		}

		System.out.println("\nTotal Mark: " + totalMark);
		System.out.println("Average Mark: " + (totalMark/numberOfSubs)); //marks.length==numberOfSubs

		int max = marks[0];
		int min = marks[0];

		//Find Maximum
		for (int x=1; x<marks.length; x++) {
			if(max < marks[x]) {
				max = marks[x];
			}
		}

		//Find Minimum
		for (int x=1; x<marks.length; x++) {
			if(min > marks[x]) {
				min = marks[x];
			}
		}

		System.out.println("Maximum Mark: " + max);
		System.out.println("Minimum Mark: " + min);
	}
}