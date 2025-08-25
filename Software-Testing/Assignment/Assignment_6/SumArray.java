package Assignments;

public class SumArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Array initialization
        int sum = 0;

        for (int num : numbers) { // Loop through each element
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
