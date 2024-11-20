import java.util.ArrayList;
import java.util.Arrays;
// import java.util.HashMap;

public class Majority2 {
    public static void main(String[] args) {
        int[] nums = {3,3,2};
        ArrayList <Integer> li = new ArrayList<>();
        li = majorityElement(nums);
        for(int i=0; i<li.size(); i++){
            System.out.print(li.get(i) +" ");
        }
    }
    static ArrayList<Integer> majorityElement(int []nums){
        ArrayList <Integer> li = new ArrayList<>();
        // HashMap <Integer,Integer> hm = new HashMap<>();
        // hm.put(nums[0],1);
        // for(int i=1; i<nums.length ; i++){
        //     hm.put(nums[i],hm.getOrDefault(nums[i], 0)+1);
        // }
        // System.out.println(hm.get(2));
        // int n = nums.length/3;
        // System.out.println(n);
        // for(int i=0; i<nums.length; i++){

        //     if(hm.get(nums[i]) > n){
        //         li.add(nums[i]);
        //     }
        // }
        Arrays.sort(nums);
        if(nums.length ==1){
            li.add(nums[0]);
            return li;
        }
        int count =1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                count ++;
            }
            else {
                if(count > nums.length/3){
                    li.add(nums[i-1]);
                }
                count = 1 ;
            }
        }
        if(count>nums.length/3){
            li.add(nums[nums.length-1]);
        }
        return li;
    }
}
