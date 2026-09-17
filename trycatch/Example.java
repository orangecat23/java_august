package trycatch;

public class Example {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            int arr[] = { 1, 2, 3 };

            System.out.println(result);
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("always executed");

        }

    }

}
