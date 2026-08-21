package controlStatements.selectionStatement;

public class License {
    public static void main(String[] args) {
        int age = 17;
        // nested if else
        boolean hasLicense = false;

        if (age >= 18) {
            if (hasLicense == true) {
                System.out.println("You can drive.");
            } else {
                System.out.println("You need a license.");
            }
        }

        else {
            System.out.println("You are underage.");
        }

    }

}
