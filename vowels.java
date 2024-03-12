public class VowelConsonantCounter {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        int[] counts = countVowelsAndConsonants(inputString.toLowerCase()); // Convert to lowercase for case-insensitivity
        
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
    }
    
    public static int[] countVowelsAndConsonants(String str) {
        int[] counts = new int[2]; // Index 0: Vowels, Index 1: Consonants
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    counts[0]++; // Vowel
                } else {
                    counts[1]++; // Consonant
                }
            }
        }
        return counts;
    }  
}