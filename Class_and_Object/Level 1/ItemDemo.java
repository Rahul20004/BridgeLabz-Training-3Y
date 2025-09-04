class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Unit: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        Item item = new Item(101, "Laptop", 55000);
        item.displayDetails();
        int qty = 2;
        System.out.println("Total Cost for " + qty + " items: " + item.calculateTotalCost(qty));
    }
}
