package Array;

import java.util.Arrays;
import java.util.List;

public class countPairsSumIsLessThanTarget {

    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        nums.sort((a,b) -> a-b);
        int l = 0;
        int r = nums.size()-1;
        while (l!=r) { 
            if(nums.get(l)+nums.get(r)<target){
                count+=r-l;
                l++;
            }
            else{
                r--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        
        countPairsSumIsLessThanTarget Coffee = new countPairsSumIsLessThanTarget();
        List<Integer> list = Arrays.asList(-1,1,2,3,1);
        System.out.println(Coffee.countPairs(list, 2));
    }
    
}
