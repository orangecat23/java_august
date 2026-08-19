package operators;

public class OperatorExample {
    public static void main(String[] args) {

        // arithmetic operators
        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Remainder: " + (num1 % num2));

        // relational operators
        int num3 = 4;
        int num4 = 6;
        System.out.println("==: " + (num3 == num4));
        System.out.println("!=: " + (num3 != num4));
        System.out.println("<=: " + (num3 <= num4));
        System.out.println(">=: " + (num3 >= num4));

        // logical operators
        boolean a = true;
        boolean b = false;
        System.out.println("&&: " + (a && b));
        System.out.println("||: " + (a || b));
        System.out.println("!: " + (!a));
        boolean isAdmin = false;
        System.out.println(!isAdmin);

        // unary operators
        int num = 7;
        int result = num++;
        System.out.println("result : " + result);
        System.out.println("num : " + num);
        // same variable
        result = ++num;
        System.out.println("result : " + result);
        System.out.println("num : " + num);
        // new variable
        int number = 7;
        int resultnew = ++number;
        System.out.println("resultnew : " + resultnew);
        System.out.println("number : " + number);

    }
}
