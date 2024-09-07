package Array;

public class MajorityElementInArray {
    public int majorityElement(int[] nums) {

        int majorityEl = 0;
        int level=0;
        for(int i = 0;i<nums.length;i++){
            if(level == 0){
                majorityEl = nums[i];
            }
            if(majorityEl == nums[i]){
                level++;
            }
            else{
                level--;
            }
        }
        return majorityEl;
        
    }
    public static void main(String[] args) {
        MajorityElementInArray Coffee = new MajorityElementInArray();
        System.out.println(Coffee.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
