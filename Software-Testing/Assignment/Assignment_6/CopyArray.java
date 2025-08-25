package Assignments;
public class CopyArray {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};
        int[] copyArray = new int[originalArray.length];

        // Copying elements
        for (int i = 0; i < originalArray.length; i++) {
            copyArray[i] = originalArray[i];
        }

        // Display original array
        System.out.print("Original Array: ");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }

        // Display copied array
        System.out.print("\nCopied Array: ");
        for (int num : copyArray) {
            System.out.print(num + " ");
        }
    }
}

