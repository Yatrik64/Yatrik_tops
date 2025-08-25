package Assignments;

import java.util.Scanner;

public class ThreeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        int greatest;

        if (num1 >= num2 && num1 >= num3) {
            greatest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }
        System.out.println("The greatest number is: " + greatest);
    }
}
