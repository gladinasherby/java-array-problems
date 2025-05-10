import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 7, 1, 2 };
        int target = 6;

        Set<String> seenPairs = new HashSet<>();
        Set<Integer> seenNumbers = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            // If the complement is already in the set, we've found a valid pair
            if (seenNumbers.contains(complement)) {
                int a = Math.min(num, complement);
                int b = Math.max(num, complement);
                seenPairs.add(a + "," + b); // Store the pair in sorted order
            }

            seenNumbers.add(num); // Add current number to seen set
        }

        // Output all the valid pairs
        for (String pair : seenPairs) {
            System.out.println("Pair: [" + pair.replace(",", ", ") + "]");
        }
    }
}
