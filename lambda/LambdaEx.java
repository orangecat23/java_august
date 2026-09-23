package lambda;

@FunctionalInterface
interface MyInterface {
    // we are using this interface as a function
    void sayHello(); // every interface method is abstract

}

interface New {
    int add(int a, int b);
}

public class LambdaEx {
    public static void main(String[] args) {
        // without lamdba expression
        MyInterface obj1 = new MyInterface() {
            public void sayHello() {
                System.out.println("hello without lambda function.");
            }

        }; // anonymous class creates $ bytecode classfile
        obj1.sayHello();

        // using lambda expression
        MyInterface obj2 = () -> {
            // implementation of the method
            System.out.println("hello with lambda function.");

        };
        obj2.sayHello();

        New ob1 = (num1, num2) -> {
            int result = num1 + num2;
            return result;
        };
        System.out.println(ob1.add(3, 3));

    }

}
