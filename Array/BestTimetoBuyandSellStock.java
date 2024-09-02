package Array;

public class BestTimetoBuyandSellStock {
    
    public int maxProfit(int[] prices) {
        int Sell = Integer.MAX_VALUE;
        int maxProfit =0;
        for(int i = 0 ; i<prices.length;i++){
            if(prices[i]<Sell){
                Sell=prices[i];
            }
            else if(prices[i]-Sell>maxProfit){
                maxProfit = prices[i]-Sell;
            }
            
        }
     
        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimetoBuyandSellStock Coffee = new BestTimetoBuyandSellStock();
        System.out.println(Coffee.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
