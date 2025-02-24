public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(SplitArray.splitArray(nums, k));
    }
    static int splitArray(int nums[], int k){
        int left = getMax(nums); 
        int right = getSum(nums); 
        
        while (left < right) {
            int mid = left + (right - left) / 2; 
            if (canSplit(nums, k, mid)) {
                right = mid;
            } else {
                left = mid + 1; 
            }
        }
        return left;
    }
    static boolean canSplit(int[] nums, int k, int maxSum) {
        int subarrays = 1;
        int currentSum = 0;
        
        for (int num : nums) {
            if (currentSum + num > maxSum) {
                subarrays++;
                currentSum = num;
                if (subarrays > k) {
                    return false; 
                }
            } else {
                currentSum += num;
            }
        }
        return true;
    }
    static int getMax(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }
    static int getSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
