class Book {
	String author, title;

	public Book(String author, String title) {
		this.author = author;
		this.title = title;
	}

	public String bookInfo() {
		return "\n\tAuthor: " + author +
				"\n\tTitle: " + title;
	}
}

class EBook extends Book {
	double fileSize;
	String downloadLink;

	public EBook(String author, String title, double fileSize, String downloadLink) {
		super(author, title);

		this.fileSize = fileSize;
		this.downloadLink = downloadLink;
	}

	public String bookInfo() {
		return super.bookInfo() + 
				"\n\tFile Size: " + fileSize + "MB" +
				"\n\tDownload Link: " + downloadLink + "\n";
	}
}

class BookInheritance {
	public static void main(String[] args) {
		// Book book = new Book("Annoymous", "Unknow");

		Book[] books = {
			new EBook("Sir Ei Maung", "Bootstrap", 2.5, "eimaung.com"),
			new EBook("James Gosling", "Java", 3.8, "james.com")
		};

		for (int x=0; x<books.length; x++) {
			System.out.print("Book-" + (x+1) + ": ");
			System.out.println(books[x].bookInfo());
		}
	}
}