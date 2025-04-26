// ----- Algorithm: Reverse an Array -----
// 1. Take the size of the array as input.
// 2. Input all elements into the array.
// 3. Use two pointers: one at the start (left), one at the end (right).
// 4. While left < right:
//    a. Swap arr[left] and arr[right]
//    b. Increment left and decrement right
// 5. After the loop, the array is reversed.
// 6. Print the reversed array.

// ----- Java Code -----
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int left = 0;
        int right = size - 1;

        while (left < right) {
            // Swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
