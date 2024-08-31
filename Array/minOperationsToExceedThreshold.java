package Array;

public class minOperationsToExceedThreshold {
    public int minOperations(int[] nums, int k) {

        int minOperations = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<k){
                minOperations++;
            }
        }

        return minOperations;
        
    }
    public static void main(String[] args) {
        minOperationsToExceedThreshold Coffee = new minOperationsToExceedThreshold();
        System.out.println(Coffee.minOperations(new int[]{1,1,2,4,9}, 1));
    }
}
