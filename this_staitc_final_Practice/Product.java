class Product {
    private static double discount = 10.0; // shared discount %

    private String productName;
    private double price;
    private int quantity;
    private final int productID; // constant id

    // Constructor -> use 'this'
    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Show details -> check instanceof
    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product: " + productName + ", Price: " + price + 
                               ", Qty: " + quantity + ", ID: " + productID +
                               ", Discount: " + discount + "%");
        }
    }

    // Static method -> update discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000, 2, 301);
        p1.displayDetails();

        Product.updateDiscount(15);
        p1.displayDetails();
    }
}
