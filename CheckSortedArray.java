// ----- Algorithm: Check if Array is Sorted -----
// 1. Take the size of the array and its elements as input.
// 2. Loop through the array from index 1 to end:
//    a. Compare each element with the previous one.
//    b. If arr[i] < arr[i-1], array is not sorted.
// 3. If no such condition is found, array is sorted in non-decreasing order.

// ----- Java Code -----
import java.util.Scanner;

public class CheckSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean isSorted = true;
        for (int i = 1; i < size; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }

        scanner.close();
    }
}
