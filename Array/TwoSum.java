package Array;

import java.util.HashMap;



public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> indexes = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int pair = target-nums[i];
            if(indexes.containsKey(pair)){
                return new int[]{nums[i],indexes.get(pair)};
            }
            indexes.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        TwoSum Coffee = new TwoSum();
        int[] nums = {2,7,11,15};
        System.out.println(Coffee.twoSum(nums, 9));
    }
}
