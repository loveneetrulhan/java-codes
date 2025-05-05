abstract class Employee {
    String name;
    String role;

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    abstract void calculateSalary();
    abstract void displayDetails();
}

class Manager extends Employee {
    double fixedSalary;

    Manager(String name, double fixedSalary) {
        super(name, "Manager");
        this.fixedSalary = fixedSalary;
    }

    @Override
    void calculateSalary() {
        System.out.println("Salary of Manager: $" + fixedSalary);
    }

    @Override
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: $" + fixedSalary);
    }
}

class Developer extends Employee {
    double hourlyRate;
    int hoursWorked;
    double salary;

    Developer(String name, double hourlyRate, int hoursWorked) {
        super(name, "Developer");
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    void calculateSalary() {
        salary = hourlyRate * hoursWorked;
        System.out.println("Salary of Developer: $" + salary);
    }

    @Override
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Salary: $" + salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 8000);
        manager.calculateSalary();
        manager.displayDetails();

        System.out.println();

        Developer developer = new Developer("Bob", 50, 160);
        developer.calculateSalary();
        developer.displayDetails();
    }
}
