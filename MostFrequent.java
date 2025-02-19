import java.util.Arrays;

public class MostFrequent {
     public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = 0;
        long total = 0;
        int maxFreq = 0;
        while (right < nums.length) {
            total += nums[right]; 
            while ((long) nums[right] * (right - left + 1) > total + k) {
                total -= nums[left]; 
                left++;
            }
            maxFreq = Math.max(maxFreq, right - left + 1);
            right++;
        }

        return maxFreq;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 4};
        int k = 5;
        System.out.println(maxFrequency(nums, k));
    }
}
