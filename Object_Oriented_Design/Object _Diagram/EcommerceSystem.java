import java.util.*;

class Product {
    String name;
    Product(String name) { this.name = name; }
}

class Order {
    int id;
    List<Product> products = new ArrayList<>();

    Order(int id) { this.id = id; }

    void addProduct(Product p) { products.add(p); }

    void showOrder() {
        System.out.println("Order " + id + " contains:");
        for(Product p : products) System.out.println(" - " + p.name);
    }
}

class Customer {
    String name;
    List<Order> orders = new ArrayList<>();

    Customer(String name) { this.name = name; }

    void placeOrder(Order o) { orders.add(o); }

    void showOrders() {
        System.out.println("Customer: " + name);
        for(Order o : orders) o.showOrder();
    }
}

public class EcommerceSystem {
    public static void main(String[] args) {
        Customer c1 = new Customer("Rahul");

        Order o1 = new Order(101);
        Order o2 = new Order(102);

        Product p1 = new Product("Laptop");
        Product p2 = new Product("Mobile");
        Product p3 = new Product("Headphones");

        o1.addProduct(p1);
        o1.addProduct(p2);
        o2.addProduct(p3);

        c1.placeOrder(o1);
        c1.placeOrder(o2);

        c1.showOrders();
    }
}
