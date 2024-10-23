public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int []arr = {1,1,0,1,1,1};
        System.out.println(maxOnes(arr));
    }
    public static int maxOnes(int [] nums){
        int k=0;
        int max =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                k++;
            }
            else{
                max=Math.max(k,max);
                k=0;
            }
        }
        if(nums[nums.length-1]==1){
            max=Math.max(k,max);
        }
        return max;
    }
}
