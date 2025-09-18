
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Teacher: " + name + ", Age: " + age + ", Subject: " + subject);
    }
}

class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Student: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

class Staff extends Person {
    String position;

    Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    void displayRole() {
        System.out.println("Staff: " + name + ", Age: " + age + ", Position: " + position);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mr. Verma", 40, "Mathematics");
        Student s1 = new Student("Rahul", 20, 12);
        Staff st1 = new Staff("Mrs. Sharma", 35, "Clerk");

        t1.displayRole();
        s1.displayRole();
        st1.displayRole();
    }
}
