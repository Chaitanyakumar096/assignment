public class ReplaceCharacter {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        int index = 7; // Index of the character to replace
        char newChar = 'X'; // New character to replace with
        
        String modifiedString = replaceCharAtIndex(originalString, index, newChar);
        System.out.println("Modified String: " + modifiedString);
    }
    
    public static String replaceCharAtIndex(String str, int index, char newChar) {
        if (index < 0 || index >= str.length()) {
            throw new IllegalArgumentException("Index is out of range");
        }
        
        char[] chars = str.toCharArray();
        chars[index] = newChar;
        
        return new String(chars);
    }
}