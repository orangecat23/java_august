package recursion;

public class RecursionEx {
    void decrement(int n) {
        if (n > 0) {
            decrement(n - 1);
            System.out.println(n);
        }
    }

    static void decrement1(int n) {
        if (n > 0) {
            System.out.println(n);
            decrement1(n - 1);
        }
    }

    public static void main(String[] args) {
        RecursionEx obj = new RecursionEx();
        obj.decrement(4);
        decrement1(4);
    }
    // do not call a function without a break condition
}
