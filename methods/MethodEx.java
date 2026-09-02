package methods;

public class MethodEx {
    /*
     * void methodName(){
     * 
     * }
     */

    void displayMsg() {
        System.out.println("this is a method");
        System.out.println("another sentence");
    }

    public static void main(String[] args) {
        // calling from the main method - displayMsg();
        // cannot just call with displayMsg() without creating an object
        MethodEx obj = new MethodEx();
        obj.displayMsg();

    }

    // void means nothing is returned
    // you cannot return values inside void method
}
