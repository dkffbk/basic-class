class CheckDayType {
	public static void main(String[] args) {
		String day = "Sunday";

		switch(day) {
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
			System.out.println("Weekday");
			break;

		case "Saturday":
		case "Sunday":
			System.out.println("Weekend");
			break;

		default:
			System.out.println("Invalid Day!");
		}
	}
}