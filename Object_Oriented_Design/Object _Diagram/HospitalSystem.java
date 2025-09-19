import java.util.*;

class Patient {
    String name;
    Patient(String name) { this.name = name; }
}

class Doctor {
    String name;
    List<Patient> patients = new ArrayList<>();

    Doctor(String name) { this.name = name; }

    void consult(Patient p) {
        patients.add(p);
        System.out.println("Doctor " + name + " consulted Patient " + p.name);
    }
}

class Hospital {
    String name;
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();

    Hospital(String name) { this.name = name; }

    void addDoctor(Doctor d) { doctors.add(d); }
    void addPatient(Patient p) { patients.add(p); }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Dr. Verma");
        Doctor d2 = new Doctor("Dr. Singh");

        Patient p1 = new Patient("Rahul");
        Patient p2 = new Patient("Priya");

        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addPatient(p1);
        h.addPatient(p2);

        d1.consult(p1);
        d2.consult(p1);
        d2.consult(p2);
    }
}
