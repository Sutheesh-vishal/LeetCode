package Array;

public class SingleNumberInArray{
    public int singleNumber(int[] nums) {
        int singleNum =0;
        for(int i=0;i<nums.length;i++){
            singleNum=singleNum^nums[i];
        }
        return singleNum;
    }
    public static void main(String[] args) {
        SingleNumberInArray Coffee = new SingleNumberInArray();
        System.out.println(Coffee.singleNumber(new int[]{2,2,1}));
    }
}