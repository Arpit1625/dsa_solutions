public class Peakele {
    public static void main(String[] args) {
        int [] arr = {1,2,3,1};
        System.out.println(findPeakElement(arr));
    }
    static int findPeakElement(int[] nums) {
        if(nums.length==1||nums[0]>nums[1]){
            return 0;
        }
        if(nums[nums.length-1]>nums[nums.length-2]){
            return (nums.length-1);
        }
        for(int i=1; i<nums.length-1;i++){
            if(nums[i]>nums[i+1]&& nums[i]>nums[i-1]){
                return i;
            }
        }
        return 0;
    }
}
