package arrays;

public class ArrSum {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 3, 5 };
        int sum = 0;
        for (int num : arr) {
            sum = sum + num;

        }
        System.out.println(sum);
    }

}
