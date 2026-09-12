package call;

public class Call {
    public static void changeValue(int a) {
        a = 10;
        System.out.println("inside changeValue: " + a);
    }

    public static void main(String[] args) {

        int a = 5;
        System.out.println("Before changeValue: " + a);
        changeValue(a);
        System.out.println("After changeValue: " + a);
    }
}
