package String;

public class decodeTheMessage {
    public String decodeMessage(String key, String message) {

        char[] map = new char[26];
        int i = 0 ;
        for (char c : key.toCharArray()){
            if(i<26&&c !=' '&&map[c-'a']==0){
                map[c-'a']=(char)(i+'a');
                i++;
            }
        }
        String ans = "";
        for(char c : message.toCharArray()){
            ans+=(c==' '?' ':map[c-'a']);
        }
        return  ans; 
    }
    public static void main(String[] args) {
        decodeTheMessage Coffee = new decodeTheMessage();
        System.out.println(Coffee.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }
}
