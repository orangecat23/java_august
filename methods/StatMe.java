package methods;

public class StatMe {

    static int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static void main(String[] args) {
        // we dont need to create an object for static method
        System.out.println(add(4, 5));
    }
}
