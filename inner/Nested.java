package inner;

class Outer {
    interface Message {
        void display();
        // interface method has a compulsory body

    }
}

class Demo implements Outer.Message {
    public void display() {
        System.out.println("Nested Interface Example.");
    }
}

public class Nested {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.display();
    }

}
