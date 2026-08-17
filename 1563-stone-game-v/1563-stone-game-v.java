class Solution {
    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + stoneValue[i];
        }
        int[][] memo = new int[n + 1][n + 1];
        return helper(prefixSum, 1, n, memo);
    }

    private int helper(int[] prefixSum, int s, int e, int[][] memo) {
        if (s == e) {
            return 0;
        }
        if (s + 1 == e) {
            return Math.min(prefixSum[e] - prefixSum[s], prefixSum[s] - prefixSum[s - 1]);
        }
        if (memo[s][e] != 0) {
            return memo[s][e];
        }
        int res = 0;
        for (int i = s; i < e; i++) {
            int left = prefixSum[i] - prefixSum[s - 1];
            int right = prefixSum[e] - prefixSum[i];
            if (left < right) {
                res = Math.max(res, left + helper(prefixSum, s, i, memo));
            } else if (left > right) {
                res = Math.max(res, right + helper(prefixSum, i + 1, e, memo));
            } else {
                res = Math.max(res, left + Math.max(helper(prefixSum, s, i, memo), helper(prefixSum, i + 1, e, memo)));
            }
        }
        memo[s][e] = res;
        return res;
    }
}