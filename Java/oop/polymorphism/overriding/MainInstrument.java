class Instrument {
	public void play() {
		System.out.println("Instrument makes a sound.");
	}
}

class Drum extends Instrument {
	public void play() {
		System.out.println("Drum is beating a rytham...");
	}
}

class Guitar extends Instrument {
	public void play() {
		System.out.println("Guitar is strumming chords...");
	}
}

class MainInstrument {
	public static void main(String[] args) {
		Instrument instrument;

		instrument = new Guitar();
		instrument.play();

		instrument = new Drum();
		instrument.play();
	}
}