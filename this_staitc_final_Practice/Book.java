class Book {
    private static String libraryName = "City Library"; // shared value

    private String title, author;
    private final String isbn; // constant unique id

    // Constructor -> use 'this'
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Show details -> check instanceof
    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Library: " + libraryName);
            System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        }
    }

    // Static method -> print library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling", "ISBN101");
        b1.displayDetails();
        Book.displayLibraryName();
    }
}
