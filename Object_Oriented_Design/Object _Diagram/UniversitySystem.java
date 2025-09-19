import java.util.*;

class Department {
    String name;
    Department(String name) { this.name = name; }
}

class Faculty {
    String name;
    Faculty(String name) { this.name = name; }
}

class University {
    String name;
    List<Department> departments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();

    University(String name) { this.name = name; }

    void addDepartment(Department d) { departments.add(d); }
    void addFaculty(Faculty f) { faculties.add(f); }

    void showUniversity() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for(Department d : departments) System.out.println(" - " + d.name);
        System.out.println("Faculties:");
        for(Faculty f : faculties) System.out.println(" - " + f.name);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        University uni = new University("XYZ University");

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Mechanical");

        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Gupta");

        uni.addDepartment(d1);
        uni.addDepartment(d2);
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showUniversity();

        // Composition: deleting university deletes departments
        uni = null;
    }
}
