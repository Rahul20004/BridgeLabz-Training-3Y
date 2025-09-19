import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(name + " - ₹" + price);
    }
}

class Order {
    int orderId;
    List<Product> products;

    Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    void addProduct(Product p) {
        products.add(p);
    }

    void showOrder() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            p.display();
        }
    }
}

class Customer {
    String name;
    List<Order> orders;

    Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    void placeOrder(Order o) {
        orders.add(o);
        System.out.println(name + " placed order #" + o.orderId);
    }

    void showOrders() {
        System.out.println("Customer: " + name + " Orders:");
        for (Order o : orders) {
            o.showOrder();
        }
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 60000);
        Product p2 = new Product("Phone", 25000);

        Order o1 = new Order(101);
        o1.addProduct(p1);
        o1.addProduct(p2);

        Customer c1 = new Customer("Rahul");
        c1.placeOrder(o1);

        c1.showOrders();
    }
}
