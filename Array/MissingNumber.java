package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int actual = n*(n+1)/2;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int missing = actual-sum;
        return missing;
    }
    public static void main(String[] args) {
        MissingNumber Coffee = new MissingNumber();
        System.out.println(Coffee.missingNumber(new int[]{3,0,1}));
    }
}
