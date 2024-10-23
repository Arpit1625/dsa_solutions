public class MissingNumber {
    public static int findMissingNumber(int[] nums){
        int n = nums.length;
        int sum =0;
        int totalSum = (n*(n+1))/2;
        for(int i=0; i<nums.length; i++){
            sum = sum+nums[i];
        }
        totalSum = totalSum -sum;
        return totalSum;
    }
    public static void main(String[] args) {
        int []nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(findMissingNumber(nums));
    }
}
