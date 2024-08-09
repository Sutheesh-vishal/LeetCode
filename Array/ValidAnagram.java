package array;


public class ValidAnagram{
    public boolean isAnagram(String s, String t) {

        //checks the length of the inputs
        if(s.length()!=t.length()) return false;

        //an array if size 26 for 26 alphabets
        int[] characters = new int[26];

        //validates the indexes based on ASCII values of the char
        for(int i=0;i<s.length();i++){
            characters[s.charAt(i)-'a']++;
            characters[t.charAt(i)-'a']--;
        }

        //checks if all the chars are same in both the inputs
        for(int character : characters){
            if(character != 0){
                return false;
            }
        }
        return true;
                
    }
    
    public static void main(String[] args) {

        ValidAnagram Coffee = new ValidAnagram();
        System.out.print(Coffee.isAnagram("anagram", "naharam"));
        
    }
}