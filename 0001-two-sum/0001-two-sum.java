class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int arr[] = new int[2];
        hm.put(nums[0] , 0);
        for(int i = 1; i < nums.length; i++){
            if(!hm.isEmpty() && hm.get(target - nums[i]) != null){
                arr[0] = hm.get(target - nums[i]);
                arr[1] = i;
            }
            hm.put(nums[i] , i);
        }
        return arr;
    }
}