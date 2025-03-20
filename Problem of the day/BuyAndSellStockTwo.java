public class BuyAndSellStockTwo {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{10, 22, 5, 80}));
        System.out.println(maxProfit(new int[]{20, 580, 420, 900}));
        System.out.println(maxProfit(new int[]{100, 90, 80, 50, 25}));
    }
    static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0 ) return 0;
        int k = 2;
        int n = prices.length;
        if (k >= n / 2) {
            int profit = 0;
            for (int i = 1; i < n; i++) {
                if (prices[i] > prices[i - 1]) {
                    profit += prices[i] - prices[i - 1];
                }
            }
            return profit;
        }
        int[][] dp = new int[k + 1][n];
        for (int i = 1; i <= k; i++) {
            int max = -prices[0];
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.max(dp[i][j - 1], prices[j] + max);
                max = Math.max(max, dp[i - 1][j] - prices[j]);
            }
        }
        return dp[k][n - 1];
    }
}
