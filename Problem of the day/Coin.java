public class Coin{
    public static int countWays(int[] coins, int sum) {
        int[] dp = new int[sum + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int j = coin; j <= sum; j++) {
                dp[j] += dp[j - coin];
            }
        }
        return dp[sum];
    }
    public static void main(String[] args) {
        System.out.println(countWays(new int[]{1, 2, 3}, 4));
        System.out.println(countWays(new int[]{2, 5, 3, 6}, 10));
        System.out.println(countWays(new int[]{5, 10}, 3));
    }
}