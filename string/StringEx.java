package string;

public class StringEx {
    public static void main(String[] args) {

        String a = "Tanaya";
        String b = "Tanaya";
        System.out.println(a == b); // true

        String name1 = new String("tanaya");
        String name2 = new String("tanaya");
        System.out.println(name1 == name2); // false

        System.out.println(name1.equals(name2)); // true because it compares values
        // immutability
        String name = a.concat("Ramgir");
        System.out.println(name);

        int num = 10;
        System.out.println(num + 20);
        System.out.println(num);

        // length
        String str = "    Hippopotamus is an animal.    ";
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str);
        System.out.println(str.trim() + " ' ");
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.charAt(7));

        System.out.println(str.indexOf("H"));
        System.out.println(str.lastIndexOf("a"));

    }
}
