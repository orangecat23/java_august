package methods;

public class ReturnT {
    // method with a return type

    int add() {
        // without parameters
        int a = 4;
        int b = 5;
        int result = a + b;
        return result;

    }

    int sub(int c, int d) {
        // with parameters
        int res = c - d;
        return res;

    }

    int displayMsg() {
        System.out.println("this is a method");

        return 0;
    }

    public static void main(String[] args) {
        // calling from the main method - displayMsg();
        // cannot just call with displayMsg() without creating an object
        ReturnT obj = new ReturnT();
        obj.displayMsg();
        System.out.println(obj.displayMsg());
        // bank balance returned
        System.out.println(obj.add());
        System.out.println(obj.sub(7, 6));

    }
}