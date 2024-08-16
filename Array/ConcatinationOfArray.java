package Array;

public class ConcatinationOfArray {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length-1;
        int[] ans = new int[2*n];

        for(int i=0;i<2*n;i++){
            if(i<nums.length-1){
                ans[i] = nums[i];
            }
            else{

                ans[i + n] = nums[i];
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        ConcatinationOfArray Coffee = new ConcatinationOfArray();
        Coffee.getConcatenation(new int[]{1,2,1});
    }
    
}
