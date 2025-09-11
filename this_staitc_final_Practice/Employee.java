class Employee {
    private static String companyName = "TechCorp"; // shared value
    private static int totalEmployees = 0; // count employees

    private String name, designation;
    private final int id; // constant id

    // Constructor -> use 'this'
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Show details -> check instanceof
    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name + ", ID: " + id + ", Designation: " + designation);
        }
    }

    // Static -> total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", 201, "Manager");
        e1.displayDetails();
        Employee.displayTotalEmployees();
    }
}
