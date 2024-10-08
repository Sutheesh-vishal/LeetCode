package Array;

public class PlusOneValue {
    public int[] plusOne(int[] digits) {

        int n = digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] plusOne = new int[n+1];
        plusOne[0] = 1;
        return plusOne;
    }
    public static void main(String[] args) {
        PlusOneValue Coffee = new PlusOneValue();
        Coffee.plusOne(new int[]{1,2,3});
    }
    
}
