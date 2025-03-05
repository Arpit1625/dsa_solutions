public class ReversePairs {
    public static void main(String[] args) {
        int arr[] = {2,4,3,5,1};
        System.out.print(reversePairs(arr));
    }
    static int reversePairs(int[] nums) {
        return mergeSortAndCount(nums, 0, nums.length - 1);
    }
    static int mergeSortAndCount(int[] nums, int left, int right) {
        if (left >= right) {
            return 0;
        }
        int mid = left + (right - left) / 2;
        int count = mergeSortAndCount(nums, left, mid) + mergeSortAndCount(nums, mid + 1, right);
        
        int j = mid + 1;
        for (int i = left; i <= mid; i++) {
            while (j <= right && nums[i] > 2 * (long) nums[j]) {
                j++;
            }
            count += j - (mid + 1);
        }
        
        int[] temp = new int[right - left + 1];
        int i = left, k = 0;
        j = mid + 1;
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= right) {
            temp[k++] = nums[j++];
        }
        System.arraycopy(temp, 0, nums, left, temp.length);
        
        return count;
    }
}
