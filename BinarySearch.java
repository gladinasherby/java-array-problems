// ----- Algorithm: Binary Search -----
// 1. Set the left index (low) to 0 and the right index (high) to the last element of the array.
// 2. While low <= high, calculate the middle index (mid) as (low + high) / 2.
// 3. If the element at mid equals the target, return mid as the element is found.
// 4. If the target is smaller than the element at mid, move the right index to mid - 1.
// 5. If the target is larger than the element at mid, move the left index to mid + 1.
// 6. If the loop ends without finding the element, return -1 indicating the target is not present in the array.

// ----- Java Code -----
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // To avoid overflow

            // Check if the target is at mid
            if (arr[mid] == target) {
                return mid; // Target found at index mid
            }

            // If target is smaller, it must be in the left half
            if (arr[mid] > target) {
                high = mid - 1;
            }
            // If target is larger, it must be in the right half
            else {
                low = mid + 1;
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements of the sorted array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index " + result);
        }

        scanner.close();
    }
}
