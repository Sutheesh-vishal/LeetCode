


public class LengthOfLastWord{
    public int lengthOfLastWord(String s) {
        
        String trimmed = s.trim();
        int count = 0;
        for(int i = trimmed.length()-1;i>=0;i--){
            if(trimmed.charAt(i)!=' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        LengthOfLastWord Coffee = new LengthOfLastWord();
        System.out.println(Coffee.lengthOfLastWord("Hello World"));
    }
}