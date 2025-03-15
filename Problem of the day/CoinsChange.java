import java.util.Arrays;
public class CoinsChange{
    public static void main(String[] args) {
        int arr[] = {4, 6, 2};
        int sum = 0;
        System.out.println(minCoins(arr, sum));
    }
    static int minCoins(int coins[], int sum) {
        int[] dp = new int[sum + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= sum; i++) {
            for (int coin : coins) {
                if (coin <= i && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[sum] == Integer.MAX_VALUE ? -1 : dp[sum];
    }
}