public class Chocolates {
    public static void main(String[] args) {
        int nums[] = {20,1,15};
        System.out.println(minCost(nums, 5));
    }
    static long minCost(int[] nums, int x) {
        int n = nums.length;
        long[] minCosts = new long[n];
        for (int i = 0; i < n; i++) {
            minCosts[i] = nums[i];
        }
        long result = Long.MAX_VALUE;
        for (int k = 1; k < n; k++) {
            long totalCost = (long) k * x; 

            for (int i = 0; i < n; i++) {
                int currentType = (i + k) % n; 
                minCosts[i] = Math.min(minCosts[i], nums[currentType]);
                totalCost += minCosts[i]; 
            }
            result = Math.min(result, totalCost);
        }
        
        return result;
    }
}
