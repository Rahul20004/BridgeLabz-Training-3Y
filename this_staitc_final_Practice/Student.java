class Student {
    private static String universityName = "Delhi University"; // shared
    private static int totalStudents = 0; // count students

    private String name, grade;
    private final int rollNumber; // constant roll no

    // Constructor -> use 'this'
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Show details -> check instanceof
    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name + ", Roll: " + rollNumber + ", Grade: " + grade);
        }
    }

    // Static -> show total students
    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Rohit", 401, "A");
        s1.displayDetails();
        Student.displayTotalStudents();
    }
}
