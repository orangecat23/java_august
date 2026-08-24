package arrays;

public class ArrayEx {
    public static void main(String[] args) {
        int[] arr = new int[7];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        System.out.println("Array length = " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // enhanced for loop
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
