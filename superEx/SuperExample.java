package superEx;

class Employee {
    int salary = 30000;

}

class Manager extends Employee {
    int salary = 60000;

    void getDetails() {
        System.out.println("manager salary " + salary);
        System.out.println("employee salary " + super.salary);
    }

}

class Parent {
    Parent() {
        System.out.println("Parent constructor called.");
    }
}

class Child extends Parent {
    Child() {
        super(); // write in the first line after cosntructor
        System.out.println("Child constructor called.");
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.getDetails();
        Child child = new Child();

    }

}
