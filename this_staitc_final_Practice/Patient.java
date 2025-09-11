class Patient {
    private static String hospitalName = "Apollo Hospital"; // shared value
    private static int totalPatients = 0; // count patients

    private String name, ailment;
    private int age;
    private final int patientID; // constant id

    // Constructor -> use 'this'
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    // Show details -> check instanceof
    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Name: " + name + ", Age: " + age +
                               ", Ailment: " + ailment + ", ID: " + patientID);
        }
    }

    // Static -> show total patients
    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Meena", 45, "Fever", 701);
        p1.displayDetails();
        Patient.getTotalPatients();
    }
}
