class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[]=new int[nums.length];
        int pref=1;
        for(int i=0;i<nums.length;i++){
            res[i]=pref;
            pref=pref*nums[i];
        }
        int post=1;
        for(int i=nums.length-1;i>=0;i--){
            res[i]=post*res[i];
            post=post*nums[i];
        }
        return res;
    }
}