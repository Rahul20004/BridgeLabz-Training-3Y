
// Library Book System with borrow method

class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    // Constructor
    LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Method to borrow a book
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }

    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("C++ Basics", "Bjarne Stroustrup", 350.0, true);
        lb.display();
        lb.borrowBook();
        lb.display();
        lb.borrowBook(); // trying again
    }
}
