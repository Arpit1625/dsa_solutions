public class MaxSubArray {
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(nums));
    }
    static int maxSum(int [] nums){
        // Correct  code but not optimal solution
        // int i=0;
        // int j= 1;
        // int maxsum = Integer.MIN_VALUE;
        // int cursum = nums[0];
        // while(j < nums.length){ 
        //     if(cursum > maxsum){
        //     maxsum = cursum;
        // }
        //     cursum = cursum + nums[j];
        //     if(cursum > maxsum){
        //         maxsum = cursum;
        //     }
             
        //      if( i != nums.length-1 && j == nums.length-1){
        //             i +=1;
        //             j = i;
        //             if(cursum > maxsum){
        //                 maxsum = cursum;
        //             }
        //             cursum = nums[i];
        //      }
        //      j++;
        // }
        // if(cursum > maxsum){
        //     maxsum = cursum;
        // }
        // return maxsum;
        
        int cursum =0;// optimal solution
        int maxsum =nums[0];
        for(int i=0; i<nums.length; i++){
         cursum = cursum + nums[i];
         if(cursum>maxsum){
             maxsum =cursum;
         }
         if(cursum<0){
             cursum =0;
         }
        }
        return maxsum;
    }
}
