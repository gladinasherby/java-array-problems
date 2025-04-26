// ----- Algorithm: Check if String is Palindrome -----
// 1. Initialize two pointers, one at the beginning (start) and one at the end (end) of the string.
// 2. While start pointer is less than or equal to the end pointer:
//     a. Compare the characters at the start and end positions of the string.
//     b. If the characters don't match, return false (not a palindrome).
//     c. If they match, move the start pointer forward and the end pointer backward.
// 3. If all characters match, return true (it is a palindrome).

// ----- Java Code -----
import java.util.Scanner;

public class PalindromeString {
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Loop through the string while start is less than or equal to end
        while (start <= end) {
            // If characters at the start and end are not the same
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Not a palindrome
            }

            start++; // Move the start pointer forward
            end--; // Move the end pointer backward
        }

        return true; // If loop completes, the string is a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a palindrome: ");
        String inputString = scanner.nextLine(); // Read user input string

        boolean result = isPalindrome(inputString); // Call isPalindrome method

        if (result) {
            System.out.println(inputString + " is a palindrome."); // Output if string is a palindrome
        } else {
            System.out.println(inputString + " is not a palindrome."); // Output if string is not a palindrome
        }

        scanner.close();
    }
}
