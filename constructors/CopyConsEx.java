package constructors;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Param. Constructor executed");

    }

    Employee(Employee emp) {
        this.name = emp.name;
        this.salary = emp.salary;
        System.out.println("Copy Constructor executed");

    }

    void displayInfo() {
        System.out.println("Employee name is : " + name + " and their salary is : " + salary);
    }
}

public class CopyConsEx {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Akhil", 50000);
        emp1.displayInfo();

        Employee emp2 = new Employee(emp1);
        emp2.name = "Arun";
        emp2.salary = 40000;
        emp2.displayInfo();
    }

}
