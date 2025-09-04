package Assignments;

import java.util.Scanner;

public class Pattern_1 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();
	        
	        for (int i = 1; i <= rows; i++) {        // outer loop for rows
	            for (int j = 1; j <= i; j++) {       // inner loop for numbers
	                System.out.print(j);
	            }
	            System.out.println();                // move to next line
	        }
	        
	        sc.close();
	    }
}
