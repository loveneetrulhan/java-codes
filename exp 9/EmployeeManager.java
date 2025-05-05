import java.util.ArrayList;

class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // toString method for printing
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: $" + salary;
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        // Add 3 employees
        employees.add(new Employee("Alice", 101, 50000));
        employees.add(new Employee("Bob", 102, 60000));
        employees.add(new Employee("Charlie", 103, 55000));

        // Update salary of employee with id 102
        for (Employee emp : employees) {
            if (emp.id == 102) {
                emp.salary = 65000;
                break;
            }
        }

        // Remove employee with id 101
        employees.removeIf(emp -> emp.id == 101);

        // Print remaining employees
        System.out.println("Remaining Employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
