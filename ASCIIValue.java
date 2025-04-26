// ----- Algorithm: Print ASCII Value of a Character -----
// 1. Take a character input from the user.
// 2. Convert the character to its ASCII value using casting.
// 3. Print the ASCII value.

// ----- Java Code -----
import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        int ascii = (int) ch; // Type casting to int gives ASCII value

        System.out.println("ASCII value of '" + ch + "' is: " + ascii);

        scanner.close();
    }
}
