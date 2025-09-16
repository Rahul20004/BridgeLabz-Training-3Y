// Abstract Vehicle class
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Abstract method to calculate rental cost
    public abstract double calculateRentalCost(int days);

    // Display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle No: " + vehicleNumber + ", Type: " + type + ", Rate: " + rentalRate);
    }

    // Getters
    public double getRentalRate() { return rentalRate; }
}

// Insurable interface
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Car subclass
class Car extends Vehicle implements Insurable {
    public Car(String number, double rate) { super(number, "Car", rate); }

    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    @Override
    public double calculateInsurance() { return 2000; }
    @Override
    public String getInsuranceDetails() { return "Car Insurance: 2000"; }
}

// Bike subclass
class Bike extends Vehicle implements Insurable {
    public Bike(String number, double rate) { super(number, "Bike", rate); }

    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    @Override
    public double calculateInsurance() { return 500; }
    @Override
    public String getInsuranceDetails() { return "Bike Insurance: 500"; }
}

// Truck subclass
class Truck extends Vehicle implements Insurable {
    public Truck(String number, double rate) { super(number, "Truck", rate); }

    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    @Override
    public double calculateInsurance() { return 5000; }
    @Override
    public String getInsuranceDetails() { return "Truck Insurance: 5000"; }
}

// Demo
class VehicleRentalDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("CAR123", 1500),
            new Bike("BIKE456", 500),
            new Truck("TRK789", 3000)
        };

        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("Rental Cost for 5 days: " + v.calculateRentalCost(5));
            if (v instanceof Insurable) System.out.println(((Insurable) v).getInsuranceDetails());
            System.out.println("-------------------------");
        }
    }
}
