public class VowelConsonantCount {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowels = 0, consonants = 0;

        // ----- Step 1: Convert entire string to lowercase -----
        str = str.toLowerCase();

        // ----- Step 2: Loop through characters -----
        for (char c : str.toCharArray()) {
            // Check if the character is a letter
            if (c >= 'a' && c <= 'z') {
                // Check if it's a vowel
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // ----- Step 3: Print result -----
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
