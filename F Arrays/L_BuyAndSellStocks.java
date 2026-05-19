// Buy and Sell Stocks

/*

You are given an array prices where price[i] is the price of a given stock on the ith day.
You want to Maximise your profit by choosing a single day to buy in a future to sell that stock.
    Return the maximum profit you can achieve from this transaction. If you cannot achieve profit, return zero.

    price = [7,1,5,3,6,4]

*/


public class L_BuyAndSellStocks {

    public static int buySellStocks(int prices[]){
        int buyPrice = prices[0];   
        // int buyPrice = Integer.MAX_VALUE;            
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            
            if (buyPrice<prices[i]) {
                int profit = prices[i] - buyPrice;

                maxProfit = Math.max(maxProfit, profit);  
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;

    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buySellStocks(prices));
    }
}

// Output:-

// 5