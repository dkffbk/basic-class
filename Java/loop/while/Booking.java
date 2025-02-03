import java.util.Scanner;

class Booking {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean found = false;

		//		Index		0	   1	  2	     3	   4
		boolean[] seats = {true, false, false, true, true};

		while(!found) {
			for (int x=0; x<seats.length; x++) {
				System.out.print(seats[x] + "\t");
			}
			System.out.println();

			System.out.print("\nEnter seat number [1 to 5] or '0' to exit: ");
			int seat = scan.nextInt();

			if (seat == 0) {
				found = true;
			} else if (seat > 0 && seat <= seats.length) {
				if (seats[seat-1] == true) {
					seats[seat-1] = false;
					System.out.println("\n\tYou have successfully taken seat number: " + seat + "\n");
				} else {
					System.out.println("\n\tSorry, seat number " + seat + " is already taken.\n");
				}
			} else {
				System.out.println("\n\tINVALID SEAT SELECTION!!!\n");
			}
		}
	}
}