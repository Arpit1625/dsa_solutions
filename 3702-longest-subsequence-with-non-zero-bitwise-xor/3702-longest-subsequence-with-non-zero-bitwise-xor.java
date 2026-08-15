class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int totalXor = 0;
        int zeroCount = 0;

        for (int x : nums) {
            totalXor ^= x;
            if (x == 0) {
                zeroCount++;
            }
        }
        if (zeroCount == n) {
            return 0;
        }
        if (totalXor != 0) {
            return n;
        }
        return n - 1;
    }
}