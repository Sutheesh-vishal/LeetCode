package array;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){

        //Initializing Hashmap
        HashMap<Integer,Integer> indexes = new HashMap<>();

        //Traversig through the num
        for(int i = 0;i<nums.length;i++){

            //Finding the pair number that equals target. 
            int pair = target-nums[i];

            //returning the index if the pair is found
            if(indexes.containsKey(pair)){
                return new int[]{indexes.get(pair),i};
            }
            //adding the value to hashmap
            indexes.put(nums[i],i);
        }
        //returning empty array if no pair is found
        return new int[]{};
    }
    public static void main(String[] args) {
        TwoSum Coffee = new TwoSum();
        int[] nums = {2,7,11,15}; //testcase
        System.out.println(Coffee.twoSum(nums, 9));
    }
}
