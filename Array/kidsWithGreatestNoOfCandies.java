package Array;

import java.util.ArrayList;
import java.util.List;

public class kidsWithGreatestNoOfCandies{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int Greatest = 0;
        for(int candy : candies){
            Greatest = Math.max(Greatest, candy);
        }
        List<Boolean> out = new ArrayList();
        for(int candy : candies){
            out.add(candy+extraCandies>=Greatest);
        }
        return out;
    }
    public static void main(String[] Args){
        kidsWithGreatestNoOfCandies Coffee  = new kidsWithGreatestNoOfCandies();
        System.out.println(Coffee.kidsWithCandies(new int[]{2,3,5,1,3},3));
            
    }
}