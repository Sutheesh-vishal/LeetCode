package array;



public class TwoSum {
    public int twoSum(int[] nums, int target) {
        int index = 0;
        int pointer = 0;
        int[] Indexes = new int[2];
        for(int i = 0;i<nums.length;i++){
            if(nums[index]+nums[i]==target){
                Indexes[pointer]=index;
                pointer++;
                
            }
            index++;
        }
        return Indexes[0];
    }
    public static void main(String[] args) {
        TwoSum Coffee = new TwoSum();
        int[] nums = {2,7,11,15};
        System.out.println(Coffee.twoSum(nums, 9));
    }
}
