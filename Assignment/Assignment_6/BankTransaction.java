
package Assignments;

import java.util.Scanner;

//Custom Exception
class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(String message) {
     super(message);
 }
}

public class BankTransaction {

 static int accountBalance = 2000; // Initial balance

 // Method to withdraw amount
 static void withdraw(int amount) throws InsufficientBalanceException {
     if (amount > accountBalance) {
         int shortage = amount - accountBalance;
         throw new InsufficientBalanceException(
             "Sorry, insufficient balance, you need more " + shortage + " Rs. to perform this transaction."
         );
     } else {
         accountBalance -= amount;
         System.out.println("Transaction successful! Remaining Balance: " + accountBalance + " Rs.");
     }
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Account balance is: " + accountBalance + "\nEnter withdraw amount: ");
     int amount = sc.nextInt();

     try {
         withdraw(amount);
     } catch (InsufficientBalanceException e) {
         System.out.println(e.getMessage());
     }

     sc.close();
 }
}
