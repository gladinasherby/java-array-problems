public class StringPermutations {
    public static void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str); // Base case: print the permutation
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i); // Swap characters
                permute(str, l + 1, r); // Recurse for the next index
                str = swap(str, l, i); // Backtrack (undo the swap)
            }
        }
    }

    // Swap characters in the string
    public static String swap(String a, int i, int j) {
        char[] chars = a.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "ABC";
        permute(str, 0, str.length() - 1); // Generate permutations for the string "ABC"
    }
}
