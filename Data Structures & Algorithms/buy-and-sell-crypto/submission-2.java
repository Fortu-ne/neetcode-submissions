class Solution {
    public int maxProfit(int[] prices) {

    if(prices.length < 1) return 0;

    int buy = Integer.MAX_VALUE;
    int profit = 0;

    for(int p : prices){
        buy = Math.min(buy, p);
        profit = Math.max(profit,p - buy);
    }


      return profit;
        
    }
}
