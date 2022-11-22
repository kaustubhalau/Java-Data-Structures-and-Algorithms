public class buyAndSellStock {

    public static int bestTimetoBuy(int[] prices) {
        // Base case...
        // If the array is empty or its length <= 1, return 0...
        if (prices == null || prices.length <= 1)
            return 0;
        // Initialize the minimum price to buy...
        int minBuy = prices[0];
        // Initialize the maximum profit...
        int profit = 0;
        // Traverse all elements through a for loop...
        for (int i = 1; i < prices.length; i++) {
            // Get the minimum price to buy...
            minBuy = Math.min(minBuy, prices[i]);
            // Get maximum profit...
            profit = Math.max(profit, prices[i] - minBuy);
        }
        return profit; // return the maximum profit...
    }

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        int answer = bestTimetoBuy(arr);
        System.out.println(answer);

    }

}
