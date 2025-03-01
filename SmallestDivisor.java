public class SmallestDivisor {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int threshold = 6;
        System.out.println(smallestDivisor(arr,threshold));
    }
    static int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = findMax(nums);
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (sumDivisionResults(nums, mid) <= threshold) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
    static int findMax(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    } 
    static int sumDivisionResults(int[] nums, int div) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] + div - 1) / div; 
        }
        return sum;
    }
}
