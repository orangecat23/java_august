package controlStatements.selectionStatement;

public class IfElse {
    public static void main(String[] args) {
        int age = 18;

        if (age >= 18) {
            System.out.println("Adult");
        } else if (age >= 14 && age < 18) {
            System.out.println("Minor");
        } else {
            System.out.println("NA");
        }

    }
}