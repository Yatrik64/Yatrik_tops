package Assignments;
import java.util.Scanner;

public class UpdateArrayElement {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};  // Initial array
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter index (0 to " + (numbers.length - 1) + "): ");
        int index = sc.nextInt();
        
        System.out.print("Enter new value: ");
        int newValue = sc.nextInt();
        
        if (index >= 0 && index < numbers.length) {
            System.out.println("Before Update:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            
            numbers[index] = newValue;  // Update element
            
            System.out.println("\nAfter Update:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Invalid index!");
        }
        
        sc.close();
    }
}
