package superEx;

class Parent {
    String name = "Parent";
}

class Child extends Parent {
    String name = "Child";

    public void printNames() {
        System.out.println("child name: " + name);
        System.out.println("child name: " + super.name);
    }

}

public class SuperEx {
    public static void main(String[] args) {
        Child child = new Child();
        child.printNames();

    }

}
