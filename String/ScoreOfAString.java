package string;


public class ScoreOfAString {

    public int scoreOfString(String s) {
        int score = 0;
        for(int i=0;i<s.length()-1;i++){

            //finds ASCII value and adds the difference to the score variable.
            //abs is to make the number absolute(positive)
            score += Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));

        }
        return score;
    }
    public static void main(String[] args) {
         ScoreOfAString Coffee = new ScoreOfAString();
         System.out.println(Coffee.scoreOfString("zaz")); 
    }
}