// ----- Algorithm: Sum of Digits in a Number -----
// 1. Take an integer input from the user.
// 2. Initialize a variable `sum` to 0.
// 3. Repeat until the number becomes 0:
//    a. Extract the last digit using modulo (% 10).
//    b. Add it to `sum`.
//    c. Remove the last digit by dividing the number by 10.
// 4. Print the final value of `sum`.

// ----- Java Code -----
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }
}
