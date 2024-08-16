package String;

public class mostWordsFoundInSentence {
    public int mostWordsFound(String[] sentences){

        int c = sentences.length;
        int n=0;
        for(int i=0;i<c;i++){
            int l = sentences[i].split(" ").length;
            n=Math.max(n, l);
        }
        return  n;
    }
    public static void main(String[] args) {
        mostWordsFoundInSentence Coffee = new mostWordsFoundInSentence();
        System.out.println(Coffee.mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
    
    }
}
