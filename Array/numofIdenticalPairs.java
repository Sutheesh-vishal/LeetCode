package Array;

public class numofIdenticalPairs {
    public int numIdenticalPairs(int[] nums) {

        int goodPairs = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                
                if(nums[i] == nums[j]){
                    goodPairs++;
                }
            }
        }
        return goodPairs;
    }
    public static void main(String[] args) {
        numofIdenticalPairs Coffee = new numofIdenticalPairs();
        System.out.println(Coffee.numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }
    
}
