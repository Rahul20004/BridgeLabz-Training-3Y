class Vehicle {
    private static double registrationFee = 5000; // shared fee

    private String ownerName, vehicleType;
    private final String registrationNumber; // constant unique reg no

    // Constructor -> use 'this'
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Show details -> check instanceof
    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName + ", Type: " + vehicleType +
                               ", RegNo: " + registrationNumber + ", Fee: " + registrationFee);
        }
    }

    // Static -> update fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Anil", "Car", "UP32AB1234");
        v1.displayDetails();

        Vehicle.updateRegistrationFee(6000);
        v1.displayDetails();
    }
}
