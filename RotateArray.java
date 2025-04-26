// ----- Algorithm: Rotate Array -----
// 1. Input the array and number of rotations.
// 2. For left rotation:
//    a. Repeat k times:
//       - Store the first element.
//       - Shift all elements to the left by one.
//       - Place the stored element at the end.
// 3. For right rotation:
//    a. Repeat k times:
//       - Store the last element.
//       - Shift all elements to the right by one.
//       - Place the stored element at the start.
// 4. Print the rotated array.

// ----- Java Code -----
import java.util.Scanner;

public class RotateArray {
    public static void rotateLeft(int[] arr, int rotations) {
        int n = arr.length;
        for (int r = 0; r < rotations; r++) {
            int temp = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = temp;
        }
    }

    public static void rotateRight(int[] arr, int rotations) {
        int n = arr.length;
        for (int r = 0; r < rotations; r++) {
            int temp = arr[n - 1];
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }
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

        System.out.print("Enter number of rotations: ");
        int k = scanner.nextInt();

        System.out.print("Rotate Left or Right (L/R): ");
        char direction = scanner.next().toUpperCase().charAt(0);

        if (direction == 'L') {
            rotateLeft(arr, k);
        } else if (direction == 'R') {
            rotateRight(arr, k);
        } else {
            System.out.println("Invalid direction!");
            scanner.close();
            return;
        }

        System.out.println("Rotated array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
