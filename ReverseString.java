// ----- Algorithm: Reverse a String -----
// 1. Initialize an empty string or a StringBuilder to store the reversed string.
// 2. Start from the last character of the input string and loop through each character backwards.
// 3. Append each character to the new string or StringBuilder.
// 4. Once the loop finishes, the new string will be the reverse of the original string.
// 5. Return the reversed string.

// ----- Java Code -----
import java.util.Scanner;

public class ReverseString {
    public static String reverse(String str) {
        StringBuilder reversedString = new StringBuilder(); // Using StringBuilder for efficient string manipulation

        // Loop through the string from end to beginning
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString.append(str.charAt(i)); // Append each character to the StringBuilder
        }

        return reversedString.toString(); // Convert StringBuilder to string and return
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String inputString = scanner.nextLine(); // Read user input string

        String reversed = reverse(inputString); // Call reverse method

        System.out.println("Reversed string: " + reversed); // Output the reversed string

        scanner.close();
    }
}
