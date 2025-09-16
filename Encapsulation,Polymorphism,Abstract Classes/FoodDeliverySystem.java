// Abstract FoodItem class
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String name, double price, int qty) {
        this.itemName = name;
        this.price = price;
        this.quantity = qty;
    }

    // Abstract method to calculate total price
    public abstract double calculateTotalPrice();

    // Display food item details
    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }

    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
}

// Discountable interface
interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

// VegItem class
class VegItem extends FoodItem implements Discountable {
    private double discount = 0;

    public VegItem(String name, double price, int qty) { super(name, price, qty); }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() - discount;
    }

    @Override
    public void applyDiscount(double percentage) {
        discount = (getPrice() * getQuantity()) * (percentage / 100);
    }

    @Override
    public String getDiscountDetails() { return "Veg discount applied: " + discount; }
}

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    private double discount = 0;
    private double extraCharge = 50; // extra charge for non-veg

    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + extraCharge - discount;
    }

    @Override
    public void applyDiscount(double percentage) {
        discount = (getPrice() * getQuantity()) * (percentage / 100);
    }

    @Override
    public String getDiscountDetails() { return "Non-Veg discount applied: " + discount; }
}

// Demo
class FoodDeliveryDemo {
    public static void main(String[] args) {
        FoodItem[] order = {
            new VegItem("Paneer Curry", 200, 2),
            new NonVegItem("Chicken Biryani", 300, 1)
        };

        for (FoodItem item : order) {
            item.getItemDetails();
            if (item instanceof Discountable) ((Discountable) item).applyDiscount(10);
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println("-------------------------");
        }
    }
}
