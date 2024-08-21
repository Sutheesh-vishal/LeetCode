package String;

public class TwoArrayStringsAreEqual {

    public boolean  arrayStringsAreEqual(String[] word1, String[] word2){

        StringBuilder wordOne = new StringBuilder();
        StringBuilder wordTwo = new StringBuilder();

        for(String item : word1){
            wordOne.append(item);
        }
        for(String item : word2){
            wordTwo.append(item);
        }
        if(wordOne.toString().equals(wordTwo.toString())){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        TwoArrayStringsAreEqual Coffee = new TwoArrayStringsAreEqual();
        System.out.println(Coffee.arrayStringsAreEqual(new String[]{"ab", "c"},new String[]{"a", "bc"}));
    }
}