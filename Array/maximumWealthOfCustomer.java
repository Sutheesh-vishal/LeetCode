package Array;

public class maximumWealthOfCustomer {

    public int maximumWealth(int[][] accounts) {
        
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
         for(int j=0;j<accounts[i].length;j++){
            sum += accounts[i][j];
         }   
         if(sum>maxWealth){
            maxWealth=sum;
         }
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        maximumWealthOfCustomer Coffee = new maximumWealthOfCustomer();
        System.out.println(Coffee.maximumWealth(new int[][]{{1,5},{7,3},{3,5}}));
    }
    
}
