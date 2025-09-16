package employee;

// Abstract class representing a general Employee
public abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters and Setters (Encapsulation)
    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    // Abstract method to calculate salary
    public abstract double calculateSalary();

    // Concrete method to display employee details
    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary
                           + ", Final Salary: " + calculateSalary());
    }
}
