abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount(); // Implemented in subclasses

    public void displayDetails() {
        System.out.println("ID: " + productId + ", Name: " + name + ", Price: " + price);
    }

    // Getters and setters
    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Electronics class
class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) { super(id, name, price); }
    @Override
    public double calculateDiscount() { return getPrice() * 0.10; } // 10% discount
    @Override
    public double calculateTax() { return getPrice() * 0.18; } // 18% tax
    @Override
    public String getTaxDetails() { return "GST: 18%"; }
}

// Clothing class
class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) { super(id, name, price); }
    @Override
    public double calculateDiscount() { return getPrice() * 0.20; } // 20% discount
    @Override
    public double calculateTax() { return getPrice() * 0.12; } // 12% tax
    @Override
    public String getTaxDetails() { return "GST: 12%"; }
}

// Groceries class
class Groceries extends Product {
    public Groceries(int id, String name, double price) { super(id, name, price); }
    @Override
    public double calculateDiscount() { return getPrice() * 0.05; } // 5% discount
}

// Demo
class ECommerceDemo {
    public static void main(String[] args) {
        Product[] products = {
            new Electronics(1, "Laptop", 50000),
            new Clothing(2, "T-Shirt", 1000),
            new Groceries(3, "Rice", 500)
        };

        for (Product p : products) {
            p.displayDetails();
            double finalPrice = p.getPrice() - p.calculateDiscount();
            if (p instanceof Taxable) finalPrice += ((Taxable) p).calculateTax();
            System.out.println("Final Price: " + finalPrice);
            System.out.println("-------------------------");
        }
    }
}
