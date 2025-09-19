import java.util.*;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Faculty: " + name);
    }
}

class Department {
    String deptName;

    Department(String deptName) {
        this.deptName = deptName;
    }

    void display() {
        System.out.println("Department: " + deptName);
    }
}

class University {
    String uniName;
    List<Department> departments;
    List<Faculty> faculties; // aggregation (can exist independently)

    University(String uniName) {
        this.uniName = uniName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d); // composition
    }

    void addFaculty(Faculty f) {
        faculties.add(f); // aggregation
    }

    void showDetails() {
        System.out.println("University: " + uniName);
        System.out.println("Departments:");
        for (Department d : departments) {
            d.display();
        }
        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            f.display();
        }
    }
}

public class UniversityFacultiesDepartments {
    public static void main(String[] args) {
        University uni = new University("XYZ University");

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Mechanical");

        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Prof. Verma");

        uni.addDepartment(d1);
        uni.addDepartment(d2);

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showDetails();

        // Composition: if uni deleted → departments vanish
        uni = null;
        // Faculties can still exist outside
        f1.display();
    }
}
