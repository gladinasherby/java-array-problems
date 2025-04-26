// ----- Algorithm: Find Missing Number in a Sequence -----
// 1. Input an array of n-1 elements, where the array contains numbers from 1 to n with one number missing.
// 2. Calculate the sum of numbers from 1 to n using the formula: sum = n * (n + 1) / 2.
// 3. Find the sum of elements in the array.
// 4. Subtract the sum of the array from the sum calculated in step 2.
// 5. The result will be the missing number in the sequence.

// ----- Java Code -----
import java.util.Scanner;

public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        int sum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }

        return sum - arraySum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array (n-1): ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements of the sequence (1 to n excluding the missing number): ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of n (the total number of elements): ");
        int n = scanner.nextInt();

        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);

        scanner.close();
    }
}
