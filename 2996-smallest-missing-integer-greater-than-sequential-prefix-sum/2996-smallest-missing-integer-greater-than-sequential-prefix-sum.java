class Solution {
    public int missingInteger(int[] nums) {
        int prefixSum = nums[0];
        int i = 1;
        while (i < nums.length && nums[i] == nums[i - 1] + 1) {
            prefixSum += nums[i];
            i++;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int x = prefixSum;
        while (set.contains(x)) {
            x++;
        }
        return x;
    }
}