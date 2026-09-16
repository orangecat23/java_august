package inner;

class Outer {
    void show() {
        class LocalInner {
            void displayWord() {
                System.out.println("Hello!");
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.displayWord();

    }

    int num = 10;

    class Inner {
        void display() {
            System.out.println(num);
        }
    }
}

public class InnerCl {
    public static void main(String[] args) {
        // object creation of inner class method
        Outer obj = new Outer();
        Outer.Inner objectInner = obj.new Inner();
        objectInner.display();
        // local inner call
        obj.show();

    }

}
