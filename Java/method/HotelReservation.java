import java.util.Scanner;

class HotelReservation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean reserved = false;
		int totalCost = 0;
		String roomType = "";

		System.out.print("Enter Customer Name: ");
		String customerName = scan.nextLine();

		while(!reserved) {
			System.out.println("\nChoose Room Type (1,2,3)\n\t1 : Sea View - $120\n\t2 : Second Sea View - $80\n\t3 : Garden View - $40");
			int chooseRoomType = scan.nextInt();

			if(chooseRoomType >= 1 && chooseRoomType <= 3) {
				System.out.print("Enter Total Room (1,2,3,4,etc...): ");
				int totalRoom = scan.nextInt();

				switch(chooseRoomType) {
				case 1: totalCost = calc(totalRoom, 120); roomType = "Sea View"; break;
				case 2: totalCost = calc(totalRoom, 80); roomType = "Second Sea View"; break;
				case 3: totalCost = calc(totalRoom, 40); roomType = "Garden view"; break;
				}

				reserved = true;
				receipt(customerName, roomType, totalRoom, totalCost);
			} else {
				System.out.println("Please enter the correct room type!");
			}
		}
	}

	public static int calc(int numberOfRoom, int pricePerRoom) {
		return numberOfRoom * pricePerRoom;
	}

	public static void receipt(String name, String type, int number, int total) {
		System.out.println("\nCustomer Name: " + name);
		System.out.println("Room Type: " + type);
		System.out.println("Total Room: " + number);
		System.out.println("Total Price: $" + total);
	}
}