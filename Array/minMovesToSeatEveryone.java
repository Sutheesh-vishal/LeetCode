package Array;

import java.util.Arrays;

public class minMovesToSeatEveryone {
    public int minMovesToSeat(int[] seats, int[] students) {

        int swaps = 0;


        Arrays.sort(seats);
        Arrays.sort(students);

        for(int i= 0;i<seats.length;i++){
            int rem = seats[i]-students[i];
            swaps+=Math.abs(rem);
        }


        return swaps;
        
    }
    public static void main(String[] args) {
        minMovesToSeatEveryone Coffee = new minMovesToSeatEveryone();
        System.out.println(Coffee.minMovesToSeat(new int[]{3,1,5},new int[]{2,7,4}));
    }
    
}
