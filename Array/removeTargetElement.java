package Array;

public class removeTargetElement{
    public int removeElement(int[] nums, int val){
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
        }

        return index;
    }
    public static void main(String[] args) {
        removeTargetElement Coffee = new removeTargetElement();
        System.out.println(Coffee.removeElement(new int[]{0,1,2,2,3,0,4,2},2));
    }
}