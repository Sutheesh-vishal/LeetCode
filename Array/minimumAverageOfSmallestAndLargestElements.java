package Array;

import java.util.Arrays;



public class minimumAverageOfSmallestAndLargestElements {
    public double minimumAverage(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);
        double minAvg = Double.MAX_VALUE;
        for (int i = 0; i < n/2; i++) {
            double Avg = (nums[i] + nums[n-i-1])/2.0;
            if(Avg<minAvg){
                minAvg=Avg;
            }
            
        }

        return minAvg;
        
    }
    public static void main(String[] args) {
        minimumAverageOfSmallestAndLargestElements Coffee = new minimumAverageOfSmallestAndLargestElements();
        System.out.println(Coffee.minimumAverage(new int[]{7,8,3,4,15,13,4,1}));
    }
    
}
