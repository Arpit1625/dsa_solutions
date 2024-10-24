public class LongestSubarray {
    public static void main(String[] args) {
        int [] arr = {-13 ,0 ,6 ,15 ,16 ,2 ,15 ,-12 ,17 ,-16 ,0 ,-3 ,19 ,-3 ,2 ,-9 ,-6};
        int n = 17;
        int k = 15;
        System.out.println(lenOfSubArray(arr, n, k));
    }
    public static int lenOfSubArray(int []nums, int n, int k){
        int length =1;
        int maxlength =0;
        int sum=0;
        int i = 0;
        int j = 0;
        while(j < nums.length){
            if(nums[j] == k && maxlength<1){
                maxlength = 1;
            }
            sum = sum + nums[j];
            if(sum < k){
                j++;
                length++;
            }
            else if(sum > k){
                if(nums[i]<0){
                    sum = sum + nums[i];
                }else{
                sum = sum - nums[i];
                }
                i++;
                j++;
            }
            else{
                if(length>maxlength){
                    maxlength = length;
                }
                  if(nums[i]<0){
                    sum = sum + nums[i];
                }else{
                sum = sum - nums[i];
                }
                i++;
                j++;
            }
        }
        if(length>maxlength  && sum == k ){
            maxlength = length;
        }
        return maxlength;
    }
}
