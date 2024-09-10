package Array;

public class MergeSortedArray {
    public void  merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(j>=0){
            if(i>=0&&nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
            }
            else{
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }       
    }
    public static void main(String[] args) {
        MergeSortedArray Coffee = new MergeSortedArray();
        Coffee.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }
}
