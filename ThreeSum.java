import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int [] nums ={-1,0,1,2,-1,-4};
        List <List<Integer>> ans = new ArrayList<>();
        ans = threeSum(nums);
        for(int i=0; i<ans.size() ; i++){
                System.out.print(ans.get(i) + " ");
        }
    }
    static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List <List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
           if(i>0 && nums[i] == nums[i-1]){
            continue;
           }
           int j = i+1;
           int k = nums.length - 1;
           while(j<k){
            int sum = nums[i]+nums[j]+nums[k];
            if(sum<0){
                j++;
            }
            else if(sum>0){
                k--;
            }
            else{
                List <Integer> li = new ArrayList<>();
                li.add(nums[i]); li.add(nums[j]); li.add(nums[k]);
                ans.add(li);
                j++;
                k--;
                while(j<k && nums[j] == nums[j-1]) {
                    j++;
                }
                while(j<k && nums[k] == nums[k+1]){
                    k--;
                }
            }
           }
        }
        return ans;
    }
}
