import java.util.*;

/*
Question:
Best Time to Buy and Sell Stock

Given an array of stock prices where prices[i] represents the price
of a stock on the ith day, find the maximum profit that can be achieved
by buying on one day and selling on a later day.

If no profit can be made, return 0.

Example:
Input:  [7, 1, 5, 3, 6, 4]
Output: 5

Approach:
Keep track of the minimum buying price seen so far and calculate
the profit for each selling price. Update the maximum profit found.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class BuyAndSellStock {

    public static int sellAndBuyStock(int[] prices) {
        int buyPrices = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrices < prices[i]) {
                int profit = prices[i] - buyPrices;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrices = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(sellAndBuyStock(prices));
    }
}