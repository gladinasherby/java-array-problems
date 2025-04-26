// ----- Algorithm: Merge Two Sorted Arrays -----
// 1. Take sizes and elements of two sorted arrays as input.
// 2. Create a third array to store merged elements.
// 3. Use three pointers: i for first array, j for second, k for merged.
// 4. Compare elements of both arrays:
//    a. If arr1[i] < arr2[j], add arr1[i] to merged[k], and increment i & k.
//    b. Else add arr2[j] to merged[k], and increment j & k.
// 5. Copy remaining elements from arr1 or arr2 (whichever is left).
// 6. Print the merged array.

// ----- Java Code -----
import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of first sorted array: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter " + size1 + " elements (sorted):");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter size of second sorted array: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter " + size2 + " elements (sorted):");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }

        int[] merged = new int[size1 + size2];
        int i = 0, j = 0, k = 0;

        while (i < size1 && j < size2) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < size1) {
            merged[k++] = arr1[i++];
        }

        while (j < size2) {
            merged[k++] = arr2[j++];
        }

        System.out.println("Merged array:");
        for (int x : merged) {
            System.out.print(x + " ");
        }

        scanner.close();
    }
}
