// ----- Algorithm: Swap Two Numbers Without Third Variable -----
// 1. Take two numbers as input from the user (say a and b).
// 2. Use arithmetic operations to swap:
//    a. a = a + b;
//    b. b = a - b;
//    c. a = a - b;
// 3. Print the swapped values.

// ----- Java Code -----
import java.util.Scanner;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        // Swapping without a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        scanner.close();
    }
}
