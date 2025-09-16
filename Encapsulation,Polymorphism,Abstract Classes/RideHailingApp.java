// Abstract Vehicle class for ride-hailing
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String id, String driver, double rate) {
        this.vehicleId = id;
        this.driverName = driver;
        this.ratePerKm = rate;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/Km: " + ratePerKm);
    }

    public double getRatePerKm() { return ratePerKm; }
}

// GPS interface
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

// Car class
class Car extends Vehicle implements GPS {
    private String location = "Garage";
    public Car(String id, String driver, double rate) { super(id, driver, rate); }
    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance; }
    @Override
    public String getCurrentLocation() { return location; }
    @Override
    public void updateLocation(String loc) { location = loc; }
}

// Bike class
class Bike extends Vehicle implements GPS {
    private String location = "Garage";
    public Bike(String id, String driver, double rate) { super(id, driver, rate); }
    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance * 0.8; }
    @Override
    public String getCurrentLocation() { return location; }
    @Override
    public void updateLocation(String loc) { location = loc; }
}

// Auto class
class Auto extends Vehicle implements GPS {
    private String location = "Garage";
    public Auto(String id, String driver, double rate) { super(id, driver, rate); }
    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance * 0.6; }
    @Override
    public String getCurrentLocation() { return location; }
    @Override
    public void updateLocation(String loc) { location = loc; }
}

// Demo
class RideHailingDemo {
    public static void main(String[] args) {
        Vehicle[] rides = {
            new Car("C001", "Rahul", 20),
            new Bike("B001", "Simran", 15),
            new Auto("A001", "Amit", 10)
        };

        double distance = 10; // km
        for (Vehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));
            if (v instanceof GPS) ((GPS) v).updateLocation("On Trip");
            System.out.println("Current Location: " + ((GPS) v).getCurrentLocation());
            System.out.println("-------------------------");
        }
    }
}
