
// Program to demonstrate default and parameterized constructors

class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();  // calls default constructor
        Book b2 = new Book("Java Programming", "James Gosling", 499.99); // parameterized
        b1.display();
        b2.display();
    }
}
