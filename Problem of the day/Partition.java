import java.util.Arrays;
public class Partition {
    public static boolean canPartition(int[] arr) {
        int totalSum = Arrays.stream(arr).sum();
        if (totalSum % 2 != 0) {
            return false;
        }
        int target = totalSum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int num : arr) {
            for (int j = target; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }
        return dp[target];
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 11, 5};
        System.out.println(canPartition(arr1));
        int[] arr2 = {1, 3, 5};
        System.out.println(canPartition(arr2));
    }
}
