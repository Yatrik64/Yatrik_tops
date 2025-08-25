package Assignments;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Original Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Reverse array in-place
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }

        System.out.print("\nReversed Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
