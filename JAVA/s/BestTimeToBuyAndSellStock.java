package s;

public class BestTimeToBuyAndSellStock {
    //
    // Input: prices = [7,1,5,3,6,4]
    // Output: 5
    // Explanation: Buy on day 2 (price = 1)
    // and sell on day 5 (price = 6), profit = 6-1 = 5.
    // Note that buying on day 2
    // and selling on day 1 is not allowed because
    // you must buy before you sell.

    static public int maxProfit(int[] prices) {
        var buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buy >= prices[i]) {
                buy = prices[i];
            } else {
                int temp = prices[i] - buy;
                // if(temp >= profit ) {
                profit += temp;
            }
            buy = prices[i];

        }
        return profit;
    }

    public static void main(String[] args) {
    	int arr[] = {7,1,5,3,6,4};
//		BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();
		System.out.println(maxProfit(arr));
	}

}
