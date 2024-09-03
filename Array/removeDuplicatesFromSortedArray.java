package Array;

public class removeDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int index = 1; 
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        removeDuplicatesFromSortedArray Coffee = new removeDuplicatesFromSortedArray();
        System.out.println(Coffee.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
    
}
