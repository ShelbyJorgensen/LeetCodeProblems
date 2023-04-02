/*
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 */

class Solution {
    public int maxProfit(int[] prices) {
        int bestPrice = Integer.MAX_VALUE;
        int bestProfit = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < bestPrice) {
                bestPrice = prices[i];
            }
            int profit = prices[i] - bestPrice;
            if(profit > bestProfit) {
                bestProfit = profit;
            }
        }

        return bestProfit;
    }
}