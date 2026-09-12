package call;

class Student {

    String name;
}

class CallByRef {

    public static void changeValue(Student s) {
        s.name = "Alice";
        System.out.println("Inside changeValue: " + s.name);
    }
}

public class Ref {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Tan";

        System.out.println("Before changeValue: " + s1.name);

        CallByRef.changeValue(s1);

        System.out.println("After changeValue: " + s1.name);
    }
}