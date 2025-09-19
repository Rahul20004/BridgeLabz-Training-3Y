import java.util.*;

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;
    List<Patient> patients;

    Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    void consult(Patient p) {
        patients.add(p); // association
        System.out.println("Doctor " + name + " is consulting patient " + p.name);
    }

    void showPatients() {
        System.out.println("Doctor " + name + " has consulted:");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}

class Hospital {
    String name;
    List<Doctor> doctors;

    Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    void addDoctor(Doctor d) {
        doctors.add(d);
    }
}

public class HospitalDoctorsPatients {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Dr. Mehta");
        Doctor d2 = new Doctor("Dr. Gupta");

        Patient p1 = new Patient("Rahul");
        Patient p2 = new Patient("Amit");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        d1.showPatients();
        d2.showPatients();
    }
}
