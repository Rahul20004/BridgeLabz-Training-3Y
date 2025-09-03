

class Product {
    String productName;       // instance variable
    double price;             // instance variable
    static int totalProducts; // class variable (shared by all objects)

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // increase whenever a new product is created
    }

    // Instance method
    void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }

    // Class method
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Phone", 20000);

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.displayTotalProducts();
    }
}
