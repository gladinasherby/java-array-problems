import java.util.*;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "swiss";

        // ----- Step 1: Count frequency of each character -----
        // LinkedHashMap keeps the order of characters as they appear in the string
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1); // Increment frequency count
        }

        // ----- Step 2: Find the first character with count = 1 -----
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                return;
            }
        }

        // If no unique character is found
        System.out.println("No non-repeating character found.");
    }
}
