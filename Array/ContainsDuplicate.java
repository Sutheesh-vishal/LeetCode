package Array;

import java.util.HashSet;
import java.util.Set;


public class ContainsDuplicate {
    
    public boolean containsDuplicate(int[] nums) {
        
        //gets Unique values of nums
        Set<Integer> uniques = new HashSet<>();

        //adds the elements in nums to uniques
        for (int i = 0; i < nums.length; i++) {
            uniques.add(nums[i]);  
        }

        //checks if there is any duplicates
        if(uniques.size() == nums.length)
            return false;
        else
            return true;
    };

    public static void main(String[] args) {
        ContainsDuplicate Coffee = new ContainsDuplicate();
        int[] num = {1,1,1,3,3,4,3,2,4,2};
        Coffee.containsDuplicate(num);
    }
}
