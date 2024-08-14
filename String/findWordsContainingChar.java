package String;

import java.util.ArrayList;
import java.util.List;

public class findWordsContainingChar {

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> index = new ArrayList<Integer>();
        for (int i = 0; i < words.length ; i++) {
            for(char letter : words[i].toCharArray()){
                if (letter == x){
                    index.add(i);
                    break;
                }
            }
        }

        return index;
    }
    public static void main(String[] args) {
        findWordsContainingChar Coffee = new findWordsContainingChar();
        System.out.println(Coffee.findWordsContaining(new String[]{"abc","bcd","aaaa","cbc"}, 'a'));
    }
    
}
