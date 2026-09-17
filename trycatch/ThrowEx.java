package trycatch;

public class ThrowEx {
    public static void main(String[] args) {
        int age = 25;
        if (age < 18) {
            throw new ArithmeticException("Age is less than 18");
        }
        System.out.println("Age is valid : " + age);
    }

}
