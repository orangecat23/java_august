package string;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Sparkles");
        sb.append(" are amazing");
        System.out.println("capacity : " + sb.capacity()); // 8+16 */

        // sb.insert(0,"Yes!");
        // sb.delete(3, 7);
        // sb.replace(0, 8, "Glitters"); //try for alphabets

        System.out.println(sb.reverse());
        System.out.println(sb.length());
        System.out.println(sb.charAt(6));

        // System.out.println(sb);

    }
}
// regarding append method -
// it does not create a new object
// it modifies the same object
