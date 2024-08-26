package Array;

public class HighestAltitude {
    public int largestAltitude(int[] gain) {

        int count = 0;
        int alt = 0;
        for(int pts : gain){
            alt += pts;
            count = Math.max(count, alt);
        }
        return count;
    }
    public static void main(String[] args) {
        HighestAltitude Coffee = new HighestAltitude();
        System.out.println(Coffee.largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }
}
