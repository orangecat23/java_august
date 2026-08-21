package controlStatements.iterationStatement;

public class ForLoopEx {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

        }

        int[] number = { 10, 20, 30, 40 };
        for (int n : number) {
            System.out.println(n);
        }

    }
}