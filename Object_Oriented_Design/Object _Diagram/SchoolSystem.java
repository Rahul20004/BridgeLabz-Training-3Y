import java.util.*;

class Course {
    String name;
    List<Student> students = new ArrayList<>();

    Course(String name) { this.name = name; }

    void addStudent(Student s) { students.add(s); }

    void showStudents() {
        System.out.println("Course: " + name + " -> Students:");
        for(Student s : students) System.out.println(" - " + s.name);
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) { this.name = name; }

    void enroll(Course c) {
        courses.add(c);
        c.addStudent(this);
    }

    void showCourses() {
        System.out.println("Student: " + name + " -> Courses:");
        for(Course c : courses) System.out.println(" - " + c.name);
    }
}

class School {
    String name;
    List<Student> students = new ArrayList<>();

    School(String name) { this.name = name; }
    void addStudent(Student s) { students.add(s); }
}

public class SchoolSystem {
    public static void main(String[] args) {
        School school = new School("ABC School");

        Student s1 = new Student("Rahul");
        Student s2 = new Student("Priya");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);

        s1.showCourses();
        s2.showCourses();
        c1.showStudents();
        c2.showStudents();
    }
}
