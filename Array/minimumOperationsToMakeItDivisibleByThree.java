package Array;

public class minimumOperationsToMakeItDivisibleByThree {

    public int minimumOperations(int[] nums) {

        int operations = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%3 != 0){
                operations+=1;
            }
            
        }
        
        return operations;
    }
    public static void main(String[] args) {
        minimumOperationsToMakeItDivisibleByThree Coffee = new minimumOperationsToMakeItDivisibleByThree();
        System.out.println(Coffee.minimumOperations(new int[]{1,2,3,4}));
    }
    
}
