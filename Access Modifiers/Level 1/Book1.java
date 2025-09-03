

class Book1 {
    public String ISBN;       // public
    protected String title;   // protected
    private String author;    // private

    // Constructor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter and Setter for private variable
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

// Subclass
class EBook extends Book {
    String format;

    EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor() + ", Format: " + format);
    }

    public static void main(String[] args) {
        EBook eb = new EBook("123-456", "Java Basics", "James Gosling", "PDF");
        eb.display();
    }
}
