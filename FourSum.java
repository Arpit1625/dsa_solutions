import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int a[] = {2 ,2 ,2 ,2 ,1 ,3};
        int tar = 8;
        List<List<Integer>> ans = new ArrayList<>();
        ans = fourSum(a, tar);
        for(int i =0; i<ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
    }
    static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
               }
            for(int j = i+1; j<nums.length; j++){
                if(j> i+1 && nums[j] == nums[j-1]){
                    continue;
                   }
                int k= j+1;
                int l = nums.length-1;
                while(k<l){
                    long sum = (long)nums[i] + nums[j] + nums[k] +nums[l];
                    if(sum < target){
                        k++;
                    }
                    else if(sum> target){
                        l--;
                    }
                    else{
                        List <Integer> li = new ArrayList<>();
                        li.add(nums[i]); li.add(nums[j]); li.add(nums[k]); li.add(nums[l]);
                        ans.add(li);
                        k++;
                        l--;
                        while(k<l && nums[k] == nums[k-1]) {
                            k++;
                        }
                        while(k<l && nums[l] == nums[l+1]){
                            l--;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
