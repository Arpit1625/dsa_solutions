public class SearchinRotatedarray2 {
    public static void main(String[] args) {
        SearchinRotatedarray2 sr = new SearchinRotatedarray2();
        int []arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        System.out.println(arr.length);
        int tar= 2;
        System.out.println(sr.search(arr,tar));
    }
    boolean search(int[] nums, int target){
        boolean ans = false;
        int min = 0;
        int max = nums.length-1;
        while(min <= max){
            int mid = min + (max-min)/2;
            if(nums[mid] == target){
                ans = true;
            }
            if(nums[mid] == nums[min] && nums[mid] == nums[max]){
                min++;
                max--;
                continue;
            }
            if(nums[mid] <= nums[max]){
                if(nums[mid]<= target && nums[max] >= target){
                    min = mid+1;
                }
                else{
                    max = mid -1;
                }
            }
            else{
                if(nums[min] <= target && target <= nums[mid]){
                    max = mid -1;
                }
                else{
                    min = mid +1;
                }
            }
        }
        return ans;
    }
}
