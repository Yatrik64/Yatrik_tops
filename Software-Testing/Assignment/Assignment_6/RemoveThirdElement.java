package Assignments;
import java.util.ArrayList;

public class RemoveThirdElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Grapes");
        list.add("Orange");

        System.out.println("Original ArrayList: " + list);

        if (list.size() >= 3) {
            list.remove(2);  // Index starts from 0, so 2 = third element
            System.out.println("After removing third element: " + list);
        } else {
            System.out.println("ArrayList has less than 3 elements!");
        }
    }
}

