package Assignments;

//Abstract class
abstract class Parent {
 abstract void message();  // abstract method
}

//First subclass
class FirstSubclass extends Parent {
 void message() {
     System.out.println("This is first subclass");
 }
}

//Second subclass
class SecondSubclass extends Parent {
 void message() {
     System.out.println("This is second subclass");
 }
}

public class AbstractClassExample {
 public static void main(String[] args) {
     // Creating objects of subclasses
     Parent obj1 = new FirstSubclass();
     Parent obj2 = new SecondSubclass();

     // Calling message() for each subclass
     obj1.message();
     obj2.message();
 }
}
