package Assignments;

public class AverageArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};  // Array initialization
        int sum = 0;

        for (int num : numbers) {
            sum += num;  // Add each element to sum
        }

        double average = (double) sum / numbers.length;  // Calculate average

        System.out.println("Average value of array elements: " + average);
    }
}
