public class Min {
    public static void main(String[] args) {
        int [] arr ={4,5,6,7,0,1,2};
       int min =findMin(arr);
       System.out.println(min);
    }
    static int findMin(int [] nums){
        int l = 0;
        int n = nums.length;
        int r = n-1;
        while (l<=r) {
            int mid = l + (r-l)/2;
            if (mid<n-1 && mid > 0) {
                if (nums[mid-1] > nums[mid] && nums[mid] < nums[mid+1]) {
                    return nums[mid];
                } else if(nums[n-1]>nums[mid]) {
                    r = mid-1;
                } else {
                    l = mid+1;
                }
            } else if (mid+1 == r) {
                return Math.min(nums[r], nums[mid]);
            }else if (mid-1 == l) {
                return Math.min(nums[mid], nums[l]);
            }else {
                return nums[mid];
                }
        }
        return -1;
    }
}
