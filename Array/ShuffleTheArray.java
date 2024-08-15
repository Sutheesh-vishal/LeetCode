package Array;

public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {

        int[]  shuffled = new int[nums.length];
        int count =0;
        for(int i=0;i<n;i++){
            shuffled[count]=nums[i];
            shuffled[count+1]=nums[i+n];
            count+=2;
        }
        return shuffled;
    }

    public static void main(String[] args) {
        ShuffleTheArray Coffee = new ShuffleTheArray();
        System.out.println(Coffee.shuffle(new int[]{2,5,1,3,4,7}, 3));
    }
    
}

