package classEx;

class Dog {
    String name;
    // String name = "Rocky";

    void bark() {
        System.out.println(name + "bark!");
    }
}

public class ObjectDemo {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.name = "Rocky";
        obj.bark();
        System.out.println(obj.name);

    }

}
