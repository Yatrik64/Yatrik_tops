
package Assignments;

import java.util.ArrayList;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Grapes");

        System.out.println("Iterating using for-each loop:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        System.out.println("\nIterating using for loop with index:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\nIterating using forEach() method:");
        list.forEach(fruit -> System.out.println(fruit));
    }
}
