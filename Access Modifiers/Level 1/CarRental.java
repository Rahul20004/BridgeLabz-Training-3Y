
// Car Rental System with cost calculation

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    // Default constructor
    CarRental() {
        customerName = "Unknown";
        carModel = "Standard";
        rentalDays = 1;
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    double calculateCost() {
        double ratePerDay;
        if (carModel.equalsIgnoreCase("SUV")) {
            ratePerDay = 2000;
        } else if (carModel.equalsIgnoreCase("Sedan")) {
            ratePerDay = 1500;
        } else {
            ratePerDay = 1000; // default for standard
        }
        return ratePerDay * rentalDays;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: " + calculateCost());
    }

    public static void main(String[] args) {
        CarRental c1 = new CarRental();
        CarRental c2 = new CarRental("Rajesh", "SUV", 5);
        c1.display();
        c2.display();
    }
}
