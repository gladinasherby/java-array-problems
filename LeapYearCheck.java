// ----- Algorithm: Leap Year Check -----
// 1. Take year input from the user.
// 2. A year is a leap year if:
//    a. It is divisible by 4.
//    b. But not divisible by 100, unless it is also divisible by 400.
// 3. Use conditional checks to determine leap year status.
// 4. Display whether the year is a leap year or not.

// ----- Java Code -----
import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}
