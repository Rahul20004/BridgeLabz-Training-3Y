abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int id, String title, String author) {
        this.itemId = id;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration(); // in days

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
}

// Reservable interface
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

// Book subclass
class Book extends LibraryItem implements Reservable {
    public Book(int id, String title, String author) { super(id, title, author); }
    @Override
    public int getLoanDuration() { return 14; }
    @Override
    public void reserveItem() { System.out.println("Book Reserved"); }
    @Override
    public boolean checkAvailability() { return true; }
}

// Magazine subclass
class Magazine extends LibraryItem implements Reservable {
    public Magazine(int id, String title, String author) { super(id, title, author); }
    @Override
    public int getLoanDuration() { return 7; }
    @Override
    public void reserveItem() { System.out.println("Magazine Reserved"); }
    @Override
    public boolean checkAvailability() { return true; }
}

// DVD subclass
class DVD extends LibraryItem implements Reservable {
    public DVD(int id, String title, String author) { super(id, title, author); }
    @Override
    public int getLoanDuration() { return 3; }
    @Override
    public void reserveItem() { System.out.println("DVD Reserved"); }
    @Override
    public boolean checkAvailability() { return true; }
}

// Demo
class LibraryDemo {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book(1, "Java Basics", "Rahul"),
            new Magazine(2, "Tech Today", "Simran"),
            new DVD(3, "Avengers", "Marvel")
        };

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) ((Reservable) item).reserveItem();
            System.out.println("-------------------------");
        }
    }
}

