package string;

public class StringBuilderEx {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Tanaya");

        System.out.println("Original: " + sb);

        // 1. append()
        sb.append(" Ramgir");
        System.out.println("After append: " + sb);

        // 2. insert()
        sb.insert(0, "Hello ");
        System.out.println("After insert: " + sb);

        // 3. delete()
        sb.delete(4, 6);
        System.out.println("After delete: " + sb);

        // 4. replace()
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        // 5. reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 6. length()
        System.out.println("Length: " + sb.length());

        // 7. charAt()
        System.out.println("Character at index 4: " + sb.charAt(4));

        // 8. capacity()
        System.out.println("Capacity: " + sb.capacity());

        // 9. toString()
        String str = sb.toString();
        System.out.println("String: " + str);
    }
}