public class NextPermutation {
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,6,5};  
      nextPermutation(arr);
      for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
      }
    }
    static void nextPermutation(int[] nums) {
      int n = nums.length;
      int i = n - 2;
      
      while (i >= 0 && nums[i] >= nums[i + 1]) {
          i--;
      }
      if (i >= 0) {  
          int j = n - 1;
          while (nums[j] <= nums[i]) {
              j--;
          }
          swap(nums, i, j);
      }
      
      reverse(nums, i + 1, n - 1);
    }
    static void swap(int[] nums, int i, int j) {
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
    }
    static void reverse(int[] nums, int start, int end) {
      while (start < end) {
          swap(nums, start, end);
          start++;
          end--;
      }
  }
}
