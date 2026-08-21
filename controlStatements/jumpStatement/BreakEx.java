package controlStatements.jumpStatement;

public class BreakEx {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;// stop the loop immediately
            }
            System.out.println(i);
        }
    }
}