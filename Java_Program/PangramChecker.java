public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Create a boolean array to track the presence of letters
        boolean[] letterPresent = new boolean[26];
        
        // Convert the input string to lowercase to handle both uppercase and lowercase letters
        input = input.toLowerCase();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            // Check if the character is a lowercase letter
            if (c >= 'a' && c <= 'z') {
                letterPresent[c - 'a'] = true;
            }
        }
        
        // Check if all letters from 'a' to 'z' are present in the array
        for (boolean present : letterPresent) {
            if (!present) {
                return false;
            }
        }
        
        return true;
    }
}
