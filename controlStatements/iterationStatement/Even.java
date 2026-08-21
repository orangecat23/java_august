package controlStatements.iterationStatement;

public class Even {
    public static void main(String[] args) {
        int i;

        for (i = 0; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
            // else {
            // System.out.println("odd num");
            // }
        }
    }
}
