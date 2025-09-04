package Assignments;

//Creating a thread by implementing Runnable interface
class MyThread implements Runnable {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("Thread is running... " + i);
         try {
             Thread.sleep(500); // pause for half second
         } catch (InterruptedException e) {
             System.out.println(e);
         }
     }
 }
}

public class RunnableExample {
 public static void main(String[] args) {
     MyThread myThread = new MyThread();
     Thread t = new Thread(myThread);  // Pass Runnable object to Thread
     t.start();  // Start the thread

     System.out.println("Main thread is running...");
 }
}