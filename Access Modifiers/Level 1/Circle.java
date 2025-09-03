
// Program to demonstrate constructor chaining

class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0); // calls parameterized constructor with default value
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();       // default value
        Circle c2 = new Circle(5.5);    // user value
        c1.display();
        c2.display();
    }
}
