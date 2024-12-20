//import java.util.Arrays;

public class Maxproduct {
    public static void main(String[] args) {
        int [] arr = {-4,-3};
        System.out.println(maxProduct(arr));
    }
    static int maxProduct(int[] nums){
        int prefix = 1; 
        int suffix =1;
        int ans =Integer.MIN_VALUE;
        for(int i=0; i<nums.length ; i++){
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;
            prefix = prefix * nums[i];
            suffix = suffix * nums[nums.length-i-1];
            ans = Math.max(ans,Math.max(prefix, suffix));
        }
        return ans;
    }
}
