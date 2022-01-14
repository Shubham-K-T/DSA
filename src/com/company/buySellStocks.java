package com.company;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class buySellStocks {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stocks = {7,1,5,3,6,4};
        buySellStocks s = new buySellStocks();
        int profit = s.maxProfit(stocks);
        System.out.println(profit);
    }
}
