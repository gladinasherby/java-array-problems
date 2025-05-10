import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 5 };

        // Step 1: Create LinkedHashSet to store unique values in order
        Set<Integer> set = new LinkedHashSet<>();

        // Step 2: Traverse array and add each element to the set
        for (int num : arr) {
            set.add(num); // duplicates are automatically ignored
        }

        // Step 3: Print the set (contains only unique elements in original order)
        System.out.println("Without Duplicates: " + set);
    }
}
