class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] ans = new long[k];
        long[] dp = new long[k];

        for (int num : nums) {
            long[] nextDp = new long[k];
            int numMod = num % k;

            nextDp[numMod] = 1;

            for (int i = 0; i < k; i++) {
                if (dp[i] > 0) {
                    int nextMod = (int) ((1L * i * numMod) % k);
                    nextDp[nextMod] += dp[i];
                }
            }

            for (int i = 0; i < k; i++) {
                ans[i] += nextDp[i];
            }

            dp = nextDp;
        }

        return ans;
    }
}
