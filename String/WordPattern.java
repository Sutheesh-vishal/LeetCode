
import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {
public boolean wordPattern(String pattern, String s) {
    String[] arr = s.split(" ");
    if (pattern.length() != arr.length) {
        return false;
    }
    
    HashMap<Character, String> charToString = new HashMap<>();
    HashSet<String> seenStrings = new HashSet<>();
    
    for (int i = 0; i < pattern.length(); i++) {
        char ch = pattern.charAt(i);
        String word = arr[i];
        
        if (charToString.containsKey(ch)) {
            if (!charToString.get(ch).equals(word)) {
                return false; // The character maps to a different word
            }
        } else {
            if (seenStrings.contains(word)) {
                return false; // The word is already mapped to a different character
            }
            charToString.put(ch, word);
            seenStrings.add(word);
        }
    }
    
    return true; // All characters and words matched correctly
}
    public static void main(String[] args) {
        WordPattern Coffee = new WordPattern();
        System.out.println(Coffee.wordPattern("abba", "dog cat cat dog"));
    }
}
