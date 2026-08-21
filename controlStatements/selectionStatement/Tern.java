package controlStatements.selectionStatement;

public class Tern {
    public static void main(String[] args) {
        int age = 7;

        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println(result);
    }
}
