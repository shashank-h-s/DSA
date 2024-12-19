public class BestTimeToBuyAndSellStock {
    static public int maxProfit(int[] prices) {
        var buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buy >= prices[i]) {
                buy = prices[i];
            } else {
                int temp = prices[i] - buy;
               if(temp >= profit ) {
                    profit = temp;
                     }
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int arr2[] = { 7, 1, 5, 10, 6, 4 };
        int arr3[] = { 7, 1, 15, 3, 6, 2 };
        // BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();
        System.out.println(maxProfit(arr));
        System.out.println(maxProfit(arr2));
        System.out.println(maxProfit(arr3));
        
    }

}
