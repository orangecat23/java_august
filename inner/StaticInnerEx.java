package inner;

class Outer {
    static int num = 10;

    static class Inner {
        void display() {
            System.out.println(num);

        }

    }
}

public class StaticInnerEx {
    public static void main(String[] args) {

        Outer.Inner obj = new Outer.Inner();
        obj.display();
    }
}
