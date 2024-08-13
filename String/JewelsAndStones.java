package String;

import java.util.HashMap;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {

        HashMap<Integer,Character> JewelsList = new HashMap<>(); 
        int jeweleCount = 0;
        for(int i=0;i<jewels.length();i++){
            JewelsList.put(i,jewels.charAt(i));
        }
        for(char stone : stones.toCharArray()){
            if(JewelsList.containsValue(stone)){
                jeweleCount++;
            }
        }        

        return jeweleCount;
    }
    public static void main(String[] args) {
        JewelsAndStones Coffee = new JewelsAndStones();
        System.out.println(Coffee.numJewelsInStones("z","ZZ"));
    }
}
