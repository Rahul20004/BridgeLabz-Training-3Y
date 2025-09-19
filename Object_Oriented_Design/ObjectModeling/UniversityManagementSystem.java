import java.util.*;

class Course {
    String courseName;
    Professor professor;
    List<Student> students;

    Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println("Professor " + p.name + " assigned to " + courseName);
    }

    void enrollStudent(Student s) {
        students.add(s);
        System.out.println("Student " + s.name + " enrolled in " + courseName);
    }

    void showDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) System.out.println("Professor: " + professor.name);
        System.out.println("Students:");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

class Student {
    String name;
    List<Course> courses;

    Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void enrollCourse(Course c) {
        courses.add(c);
        c.enrollStudent(this);
    }
}

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul");
        Student s2 = new Student("Amit");

        Professor p1 = new Professor("Dr. Sharma");

        Course c1 = new Course("Data Structures");
        c1.assignProfessor(p1);

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);

        c1.showDetails();
    }
}
