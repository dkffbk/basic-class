class ExitLoop {
	public static void main(String[] args) {
		boolean exit = true;
		int x = 1;

		while(exit) {
			System.out.println(x);

			if (x == 3) {
				break;
				// exit = false;
			}
			x++;
		}
	}
}