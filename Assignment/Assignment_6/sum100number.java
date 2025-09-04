package Assignments;

public class sum100number {
	
	 public static void main(String[] args) {
	        int count = 0;       // To count how many primes found
	        int number = 2;      // Starting number to check
	        int sum = 0;

	        while (count < 100) {
	            if (isPrime(number)) {
	                sum += number;
	                count++;
	            }
	            number++;
	        }

	        System.out.println("Sum of first 100 prime numbers is: " + sum);
	    }

	    // Method to check prime number
	    public static boolean isPrime(int n) {
	        if (n <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) return false;
	        }
	        return true;
	    }
}