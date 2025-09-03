

class Employee {
    public int employeeID;     // public
    protected String department; // protected
    private double salary;     // private

    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

// Subclass
class Manager extends Employee {
    String teamName;

    Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    void display() {
        System.out.println("ID: " + employeeID + ", Department: " + department + ", Salary: " + getSalary() + ", Team: " + teamName);
    }

    public static void main(String[] args) {
        Manager m = new Manager(201, "IT", 75000, "Development");
        m.setSalary(80000);
        m.display();
    }
}
