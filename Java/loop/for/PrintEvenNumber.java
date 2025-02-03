class PrintEvenNumber {
	public static void main(String[] args) {
		/*
			2	(init)
			4
			6	++
			8
			10
		*/
		for(int x=2; x<=10; x++) {
			if(x%2 == 0)
				System.out.print(x + "\n");
		}
	}
}