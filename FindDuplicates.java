// ----- Algorithm: Find Duplicate Elements in an Array -----
// 1. Take the size of the array and its elements as input.
// 2. Use two nested loops:
//    a. Outer loop runs from 0 to n-1.
//    b. Inner loop runs from i+1 to n.
//    c. Compare arr[i] with arr[j].
//    d. If they are equal, and not already printed, mark as duplicate.
// 3. Use a boolean array or check to avoid printing the same duplicate again.

// ----- Java Code -----
import java.util.Scanner;

public class FindDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        boolean[] visited = new boolean[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            visited[i] = false;
        }

        System.out.println("Duplicate elements:");
        for (int i = 0; i < size; i++) {
            if (visited[i])
                continue;
            boolean isDuplicate = false;

            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    visited[j] = true;
                }
            }

            if (isDuplicate) {
                System.out.println(arr[i]);
            }
        }

        scanner.close();
    }
}
