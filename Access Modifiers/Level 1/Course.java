

class Course {
    String courseName;    // instance variable
    int duration;         // instance variable
    double fee;           // instance variable
    static String instituteName = "ABC Institute"; // class variable

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: " + fee + ", Institute: " + instituteName);
    }

    // Class method
    static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 10000);
        Course c2 = new Course("Python", 3, 8000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("XYZ Academy");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
