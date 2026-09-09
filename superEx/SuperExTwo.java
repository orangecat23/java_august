package superEx;

class Parent {
    Parent() {
        System.out.println(
                "parent constructor called.");
    }
}

class Child extends Parent {

    Child() {
        super();
        System.out.println("child constructor called.");
    }
}

public class SuperExTwo {
    public static void main(String[] args) {

        Child child = new Child();
    }

}
