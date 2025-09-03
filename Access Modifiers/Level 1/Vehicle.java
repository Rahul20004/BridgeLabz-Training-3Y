

class Vehicle {
    String ownerName;         // instance variable
    String vehicleType;       // instance variable
    static double registrationFee = 5000; // class variable

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Registration Fee: " + registrationFee);
    }

    // Class method
    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ravi", "Car");
        Vehicle v2 = new Vehicle("Meena", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(7000);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
