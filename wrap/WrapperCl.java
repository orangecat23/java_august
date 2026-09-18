package wrap;

public class WrapperCl {
    public static void main(String[] args) {
        int num = 10; // primitive
        Integer num2 = Integer.valueOf(num); // wrapper
        System.out.println(num2);

        Integer a = 100;
        Integer b = 100;
        // System.out.println(a == b);
        System.out.println(a.equals(b));

    }

}
