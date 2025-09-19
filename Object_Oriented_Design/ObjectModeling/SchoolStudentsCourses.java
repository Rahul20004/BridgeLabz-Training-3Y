import java.util.*;

class Course {
    String name;
    List<Student> students;

    Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showEnrolledStudents() {
        System.out.println("Course: " + name + " has students:");
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
        c.addStudent(this); // association many-to-many
    }

    void viewCourses() {
        System.out.println("Student: " + name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.name);
        }
    }
}

class School {
    String schoolName;
    List<Student> students;

    School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    void addStudent(Student s) {
        students.add(s); // aggregation: school contains students
    }

    void showStudents() {
        System.out.println("School: " + schoolName + " has students:");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

public class SchoolStudentsCourses {
    public static void main(String[] args) {
        School school = new School("ABC Public School");

        Student s1 = new Student("Rahul");
        Student s2 = new Student("Amit");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        // aggregation
        school.addStudent(s1);
        school.addStudent(s2);

        // association
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        school.showStudents();
        s1.viewCourses();
        s2.viewCourses();
        c1.showEnrolledStudents();
        c2.showEnrolledStudents();
    }
}
