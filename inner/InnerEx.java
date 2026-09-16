package inner;

//anonymous inner class
interface Greet {
    void sayHello();
}

public class InnerEx {
    public static void main(String[] args) {
        Greet ob = new Greet() {
            public void sayHello() {
                System.out.println("Hello world!");
            }
        };
        ob.sayHello();
    }

}
