// Abstract Patient class
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    // Abstract method to calculate bill
    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

// Interface for medical records
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// InPatient class
class InPatient extends Patient implements MedicalRecord {
    private String diagnosis;
    private double roomCharges;
    private String records = "";

    public InPatient(int id, String name, int age, String diagnosis, double roomCharges) {
        super(id, name, age);
        this.diagnosis = diagnosis;
        this.roomCharges = roomCharges;
    }

    @Override
    public double calculateBill() { return 5000 + roomCharges; }

    @Override
    public void addRecord(String record) { records += record + "\n"; }
    @Override
    public void viewRecords() { System.out.println("Records:\n" + records); }
}

// OutPatient class
class OutPatient extends Patient implements MedicalRecord {
    private String diagnosis;
    private double consultationFee;
    private String records = "";

    public OutPatient(int id, String name, int age, String diagnosis, double fee) {
        super(id, name, age);
        this.diagnosis = diagnosis;
        this.consultationFee = fee;
    }

    @Override
    public double calculateBill() { return consultationFee; }

    @Override
    public void addRecord(String record) { records += record + "\n"; }
    @Override
    public void viewRecords() { System.out.println("Records:\n" + records); }
}

// Demo
class HospitalDemo {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient(1, "Rahul", 30, "Surgery", 2000),
            new OutPatient(2, "Simran", 25, "Checkup", 500)
        };

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill Amount: " + p.calculateBill());
            if (p instanceof MedicalRecord) {
                ((MedicalRecord) p).addRecord("Initial diagnosis recorded.");
                ((MedicalRecord) p).viewRecords();
            }
            System.out.println("-------------------------");
        }
    }
}
