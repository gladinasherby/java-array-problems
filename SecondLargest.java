// ----- Algorithm: Find the Second Largest Element in an Array -----
// 1. Take the size of the array as input.
// 2. Input all elements into the array.
// 3. Initialize two variables: first = Integer.MIN_VALUE, second = Integer.MIN_VALUE.
// 4. Traverse the array:
//    a. If arr[i] > first, then:
//        - second = first
//        - first = arr[i]
//    b. Else if arr[i] > second and arr[i] != first, then:
//        - second = arr[i]
// 5. After the loop, second holds the second largest value.
// 6. Print second (or print a message if second is not found).

// ----- Java Code -----
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element: " + second);
        }

        scanner.close();
    }
}
