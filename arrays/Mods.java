package arrays;

import java.util.Arrays;

public class Mods {
    public static void main(String[] args) {
        int[] numbers = { 50, 20, 40, 10, 30 };

        System.out.println("Original array: " + Arrays.toString(numbers));

        // update
        numbers[2] = 100;
        System.out.println("After update: " + Arrays.toString(numbers));

        // delete
        numbers[1] = 0;
        System.out.println("After delete: " + Arrays.toString(numbers));

        // swap
        int temp = numbers[0];
        numbers[0] = numbers[4];
        numbers[4] = temp;
        System.out.println("After swap: " + Arrays.toString(numbers));

        // sort
        Arrays.sort(numbers);
        System.out.println("After sort: " + Arrays.toString(numbers));

        // reverse
        for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
        System.out.println("After reverse: " + Arrays.toString(numbers));
    }

}
