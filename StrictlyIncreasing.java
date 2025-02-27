class StrictlyIncreasing {
    public boolean canBeIncreasing(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] >= nums[i]) {
                count++;
                if (count > 1) {
                    return false;
                }
                if (i > 1 && nums[i - 2] >= nums[i]) {
                    nums[i] = nums[i - 1];
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        StrictlyIncreasing solution = new StrictlyIncreasing();
        int[] nums = {1, 2, 10, 5, 7};
        System.out.println(solution.canBeIncreasing(nums));
    }
}
