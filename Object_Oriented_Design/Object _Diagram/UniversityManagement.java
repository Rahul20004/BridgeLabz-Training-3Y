import java.util.*;

class Course {
    String name;
    Professor professor;
    List<Student> students = new ArrayList<>();

    Course(String name) { this.name = name; }

    void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println("Professor " + p.name + " assigned to " + name);
    }

    void enrollStudent(Student s) {
        students.add(s);
        System.out.println("Student " + s.name + " enrolled in " + name);
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) { this.name = name; }

    void enrollCourse(Course c) {
        courses.add(c);
        c.enrollStudent(this);
    }
}

class Professor {
    String name;
    Professor(String name) { this.name = name; }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul");
        Student s2 = new Student("Priya");

        Professor p1 = new Professor("Dr. Sharma");

        Course c1 = new Course("AI");
        Course c2 = new Course("ML");

        c1.assignProfessor(p1);
        c2.assignProfessor(p1);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);
    }
}
