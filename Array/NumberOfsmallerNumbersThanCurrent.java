package Array;

public class NumberOfsmallerNumbersThanCurrent {

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] arr = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            int count = 0;
            int max = nums[i];
            for(int j = 0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            arr[i]=count;
        }
        return arr;
    }
    public static void main(String[] args) {
        NumberOfsmallerNumbersThanCurrent Coffee = new NumberOfsmallerNumbersThanCurrent();
        System.out.println(Coffee.smallerNumbersThanCurrent(new int[]{8,1,2,2,3}));
    }
    
}
