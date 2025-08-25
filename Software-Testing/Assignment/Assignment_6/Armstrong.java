package Assignments;

import java.util.Scanner;

public class Armstrong {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        int original = num;
	        int sum = 0;
	        
	        while (num > 0) {
	            int digit = num % 10;
	            sum += digit * digit * digit;  // cube of each digit
	            num /= 10;
	        }
	        
	        if (sum == original)
	            System.out.println(original + " is an Armstrong Number.");
	        else
	            System.out.println(original + " is Not an Armstrong Number.");
	        
	        sc.close();
	    }
	}
