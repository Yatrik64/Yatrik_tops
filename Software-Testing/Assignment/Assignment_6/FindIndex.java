package Assignments;

import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Array initialization
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to find: ");
        int key = sc.nextInt();
        
        int index = -1; // default value if element is not found
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                index = i;
                break;
            }
        }
        
        if (index == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + index);
        }
        
        sc.close();
    }
}
