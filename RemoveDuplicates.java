// ----- Algorithm: Remove Duplicates from Sorted Array -----
// 1. Input a sorted array.
// 2. If the array is empty or has only one element, return the same array.
// 3. Use two pointers: one (i) to iterate through the array, and another (j) to track unique elements.
// 4. If an element is not equal to the last unique element, move the unique pointer (j) and place the element at that position.
// 5. Continue iterating through the array until the end.
// 6. Return the array with duplicates removed, and the length of the array will be the position of the last unique element.

// ----- Java Code -----
import java.util.Scanner;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0)
            return 0;

        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        return j + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int length = removeDuplicates(arr);
        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
