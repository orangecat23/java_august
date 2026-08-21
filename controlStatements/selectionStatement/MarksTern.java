package controlStatements.selectionStatement;

public class MarksTern {
    public static void main(String[] args) {
        int marks = 90;

        String grade = (marks >= 90) ? "Grade A" : (marks >= 75) ? "Grade B" : (marks >= 60) ? "Grade C" : "Grade D";

        System.out.println(grade);
    }
}