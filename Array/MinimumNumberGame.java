package Array;


import java.util.Arrays;

public class MinimumNumberGame {
    public int[] numberGame(int[] nums) {

        Arrays.sort(nums);
        int[] Output = new int[nums.length];
        for(int i = 0 ; i<nums.length;i+=2){
            Output[i] = nums[i+1];
            Output[i+1] = nums[i];
             
        }
        return  Output;

    }
    public static void main(String[] args) {
        MinimumNumberGame Coffee = new MinimumNumberGame();
        Coffee.numberGame(new int[]{5,4,2,3});
    }
}
