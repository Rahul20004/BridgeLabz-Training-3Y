// Abstract Employee class
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int id, String name, double baseSalary) {
        this.employeeId = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();

    // Display employee details
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }

    // Getters and setters
    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }
}

// Interface for department
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

// Full-time employee
class FullTimeEmployee extends Employee implements Department {
    private String department;
    public FullTimeEmployee(int id, String name, double salary) { super(id, name, salary); }

    @Override
    public double calculateSalary() { return getBaseSalary(); }

    @Override
    public void assignDepartment(String deptName) { this.department = deptName; }
    @Override
    public String getDepartmentDetails() { return department; }
}

// Part-time employee
class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int workHours;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, double hourlyRate, int hours) {
        super(id, name, 0);
        this.hourlyRate = hourlyRate;
        this.workHours = hours;
    }

    @Override
    public double calculateSalary() { return hourlyRate * workHours; }

    @Override
    public void assignDepartment(String deptName) { this.department = deptName; }
    @Override
    public String getDepartmentDetails() { return department; }
}

// Demo
class EmployeeManagementSystemDemo {
    public static void main(String[] args) {
        Employee[] employees = {
            new FullTimeEmployee(1, "Rahul", 50000),
            new PartTimeEmployee(2, "Simran", 200, 80)
        };

        ((Department) employees[0]).assignDepartment("HR");
        ((Department) employees[1]).assignDepartment("IT");

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Department: " + ((Department) emp).getDepartmentDetails());
            System.out.println("-------------------------");
        }
    }
}
