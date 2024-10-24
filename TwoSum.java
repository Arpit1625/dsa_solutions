import java.util.HashMap;
public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target =9;
        int [] arr1 = twoSum(arr,target);
        for(int i=0; i<  arr1.length; i++){
            System.out.print(arr1[i] +" ");
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap  <Integer,Integer> hm = new HashMap<>(); 
        for(int i=0;i<nums.length; i++){
            if(hm.isEmpty() || hm.get(target-nums[i]) == null ){
                hm.put(nums[i],i);
            }
            else{
                return new int [] {hm.get(target-nums[i]),i};
            }
        }
        return new int[] {-1,-1};
    }
}
