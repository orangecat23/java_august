package constructors;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Constructor executed");

    }

    void displayInfo() {
        System.out.println("Employee name is : " + name + " and their salary is : " + salary);
    }
}

public class ParamConEx {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Akhil", 50000);
        emp1.displayInfo();
    }

}
