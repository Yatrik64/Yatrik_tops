package Assignments;

public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {10, 45, 30, 89, 50, 89};  // Example array

        if (numbers.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements are same).");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}
