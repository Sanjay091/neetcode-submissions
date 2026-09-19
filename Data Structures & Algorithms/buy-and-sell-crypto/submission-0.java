class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            minPrice = Math.min(minPrice, prices[i]);
            int curProfit = prices[i]-minPrice;
            profit = Math.max(profit, curProfit);
        }
        return profit;
    }
}
