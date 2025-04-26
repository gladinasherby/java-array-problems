// ----- Algorithm: Find the Second Largest Element in an Array -----
// 1. Initialize two variables, first and second, to store the largest and second largest values.
// 2. Iterate through the array, updating first and second as follows:
//     a. If the current element is greater than first, update second to first and then first to the current element.
//     b. If the current element is smaller than first but greater than second, update second to the current element.
// 3. Once the loop finishes, second will hold the second largest element in the array.

// ----- Java Code -----
import java.util.Scanner;

public class SecondLargestElement {
    public static int findSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE; // Initialize first to smallest possible value
        int second = Integer.MIN_VALUE; // Initialize second to smallest possible value

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first; // Update second to first
                first = arr[i]; // Update first to the current element
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i]; // Update second to the current element
            }
        }

        return second; // Return the second largest element
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt(); // Read number of elements
        int[] arr = new int[n]; // Create an array of the entered size

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Read each element
        }

        int result = findSecondLargest(arr); // Call findSecondLargest method
        System.out.println("The second largest element is: " + result); // Output the result

        scanner.close();
    }
}
