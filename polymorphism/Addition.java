package polymorphism;

class calculator {
    // method overloading - quantity of params
    // public int add(int num1, int num2) {
    // return num1 + num2;

    // }

    // public int add(int num1, int num2, int num3) {
    // return num1 + num2 + num3;

    // }

    // public double add(double num1, double num2) {
    // return num1 + num2;
    // }

    // public double add(double num1, double num2, double num3) {
    // return num1 + num2 + num3;
    // }

    // method overloading - order of params
    public void add(String a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, String b) {
        System.out.println(a + b);
    }

    // method overloading - type of params
    public void add(String str) {
        System.out.println(str);

    }

    public void add(int num) {
        System.out.println(num);
    }

}

public class Addition {

    public static void main(String[] args) {
        calculator calc = new calculator();

        // quantity
        // System.out.println(calc.add(5, 10));
        // System.out.println(calc.add(5, 10, 5));
        // System.out.println(calc.add(5.2, 10.2));
        // System.out.println(calc.add(5.2, 10, 12.1));

        // order
        calc.add(5, "6");
        calc.add("6", 5);

        // type
        calc.add("Hello, World!");
        calc.add(42);

    }
}
