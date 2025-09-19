import java.util.*;

class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String deptName;
    List<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void showDept() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.display();
        }
    }
}

class Company {
    String name;
    List<Department> departments;

    Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showCompany() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.showDept();
        }
    }
}

public class CompanyDepartments {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");

        Department d1 = new Department("IT");
        d1.addEmployee(new Employee("Rahul"));
        d1.addEmployee(new Employee("Amit"));

        Department d2 = new Department("HR");
        d2.addEmployee(new Employee("Priya"));

        comp.addDepartment(d1);
        comp.addDepartment(d2);

        comp.showCompany();

        // Composition: if company is deleted → departments & employees vanish
        comp = null;
    }
}
