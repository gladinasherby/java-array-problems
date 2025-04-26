// ----- Algorithm: Find the Largest Element in an Array -----
// 1. Take the size of the array as input.
// 2. Input all elements of the array.
// 3. Assume the first element is the largest (let max = arr[0]).
// 4. Loop through the array starting from index 1:
//    a. If arr[i] > max, then update max = arr[i].
// 5. After the loop, max will contain the largest element.
// 6. Print max.

// ----- Java Code -----
import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest element: " + max);

        scanner.close();
    }
}
