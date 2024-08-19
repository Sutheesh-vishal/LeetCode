package String;

import java.util.Stack;

public class reversePrefixOfWord {
    public String reversePrefix(String word, char ch){

        int occurence = word.indexOf(ch);
        if(occurence == -1){
            return word;
        }
        Stack<Character> stack = new Stack<>();
        for(int i =0; i<=occurence;i++){
            stack.add(word.charAt(i));
        }
        String builder = "";
        while(!stack.isEmpty()){
            builder+=stack.pop();
        }
        for(int i = (occurence+1);i<word.length();i++){
            builder+= word.charAt(i);
        }
        return builder;
    }
    public static void main(String[] args) {
        reversePrefixOfWord Coffee = new reversePrefixOfWord();
        System.out.println(Coffee.reversePrefix("abcdefd",'d'));

    }
}
