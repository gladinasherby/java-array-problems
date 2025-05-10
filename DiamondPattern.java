public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5; // height of the diamond (number of rows for upper half)

        // Upper triangle (including middle row)
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print stars (2*i - 1 stars in each row)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        // Lower triangle
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
