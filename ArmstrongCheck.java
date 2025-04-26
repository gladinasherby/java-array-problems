// ----- Algorithm: Armstrong Number Check -----
// 1. Get a number from the user.
// 2. Store the original number for comparison.
// 3. Count the number of digits in the number.
// 4. Initialize a variable to store the sum of powered digits.
// 5. Loop while the number is greater than 0:
//    a. Extract the last digit.
//    b. Raise the digit to the power of total digits.
//    c. Add the result to the sum.
//    d. Remove the last digit from the number.
// 6. If the sum equals the original number, it is an Armstrong number.
// 7. Otherwise, it is not an Armstrong number.
// 8. Display the result.


// ----- Java Code -----
import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int original = num;
        int result = 0;

        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            result += Math.pow(digit, digits);
            num /= 10;
        }

        if (result == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
