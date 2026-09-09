package polymorphism;

class Employee {
    String name;
    double baseSalary;

    public double calculateSalary() {
        return baseSalary;
    }

    public void displayDetails() {
        System.out.println("name: " + name);
        System.out.println("base salary : " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    double bonus;

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

class TemporaryEmployee extends Employee {
    int projectsCompleted;
    double ratePerProject;

    @Override
    public double calculateSalary() {
        return projectsCompleted * ratePerProject;
    }
}

public class OverrideEx {
    public static void main(String[] args) {

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.name = "Jane Smith";
        fullTimeEmployee.baseSalary = 60000.0;
        fullTimeEmployee.bonus = 4000.0;
        fullTimeEmployee.displayDetails();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        partTimeEmployee.name = "John Doe";
        partTimeEmployee.hoursWorked = 80;
        partTimeEmployee.hourlyRate = 500.0;
        partTimeEmployee.displayDetails();

        TemporaryEmployee temporaryEmployee = new TemporaryEmployee();
        temporaryEmployee.name = "Tanaya";
        temporaryEmployee.projectsCompleted = 5;
        temporaryEmployee.ratePerProject = 3000.0;
        temporaryEmployee.displayDetails();
    }
}