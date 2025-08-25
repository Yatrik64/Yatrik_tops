package Assignments;
import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num =sc.nextInt();
		long fact=1;
		
		for(int i =1;i <=num; i++)
		{
			fact =fact*i;
		}
		System.out.println("factorial of" + num + "is: " + fact);
		
	}

}
