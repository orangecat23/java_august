package constructors;

class Dog {
    int legs;
    String name;

    Dog() {
        System.out.println("Default Cons.");
    }

    Dog(int l, String n) {
        this.legs = l;
        this.name = n;

    }

}

public class ConstructorEx {
    public static void main(String[] args) {
        // Dog obj = new Dog();
        Dog dog1 = new Dog(4, "Jerry");
        System.out.println(dog1.legs);
        System.out.println(dog1.name);

    }

}
