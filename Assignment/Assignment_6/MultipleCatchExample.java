package Assignments;

import java.util.Scanner;

public class MultipleCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = Integer.parseInt(sc.nextLine());  // May throw NumberFormatException

            int result = 100 / num;  // May throw ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid integer!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling...");
        sc.close();
    }
}
