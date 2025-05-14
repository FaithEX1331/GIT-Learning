package learning.School.Class_3;
public class P_2 {
    public static char findFirstNonRepeatingCharacter(String str) {
        int[] charCount = new int[256]; // Assuming ASCII character set

        // Count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }
        // Find the first character with a frequency of 1
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        // If no non-repeating character is found, return a special value
        return '\0'; // '\0' represents "no character"
    }

    public static void main(String[] args) {
        String input = "arghya"; // Example input
        char result = findFirstNonRepeatingCharacter(input);

        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
