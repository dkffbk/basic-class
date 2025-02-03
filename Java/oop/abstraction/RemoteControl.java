import java.util.Scanner;

abstract class Remote {
	public abstract void display();
	public abstract void turnOn();
	public abstract void turnOff();
}

class TV extends Remote {
	private boolean isOn;
	private int currentChannel;
	private String[] channels = {
		"News",
		"Movies",
		"Cartoons",
		"Sports"
	};

	public TV() {
		this.isOn = false;
		this.currentChannel = 0;
	}

	public void display() {
		System.out.println("tv remote controller".toUpperCase());
	}

	public void turnOn() {
		if(!isOn) {
			System.out.println("TV is now ON.");
			isOn = true;
		} else {
			System.out.println("TV is already ON!");
		}
	}

	public void turnOff() {
		if(isOn) {
			System.out.println("TV is now OFF.");
			isOn = false;
		} else {
			System.out.println("TV is already OFF!");
		}
	}

	public void changeChannel(int channel) {
		System.out.println("\n\t\n" + channels[channel-1] + "\n");
	}
}

class RemoteControl {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		TV tv = new TV();
		boolean isExit = true;

		while(isExit) {
			tv.display();

			System.out.println("1- Turn on\n2- Turn off\n3- Change channel\n4- Exit");
			System.out.print("Choose an Option[1-4]: ");
			int action = scanner.nextInt();

			line();
			switch(action) {
				case 1:
					tv.turnOn();
					break;

				case 2:
					tv.turnOff();
					break;

				case 3:
					System.out.print("Enter the channel you want to change: ");
					int channel = scanner.nextInt();

					tv.changeChannel(channel);
					break;

				case 4:
					System.out.println("Exiting System");
					isExit = false;
					break;
				default:
					System.out.println("Invalid Option!");
			}
			line();
		}
	}
	public static void line() {
		for (int x=1; x<=40; x++) {
			System.out.print("=");
		}
		System.out.println();
	}
}