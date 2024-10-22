public class RotateArray {
    // to reverse an array in given indexes
    static void reverse(int arr[], int start ,int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    // to print an array
    static void dis(int arr[]){
        for(int i=0; i<arr.length; i++){
           System.out.print(arr[i]+" ");
        }
        System.out.println();
   }
   //rotate an array
    static void rotateArray(int nums[],int k){
        if(nums.length < 2){
            return;
        }
        k =k%nums.length;
        reverse(nums, 0, (nums.length-k)-1);
        dis(nums);
        reverse(nums, (nums.length-k) , nums.length-1);
        dis(nums);
        reverse(nums , 0, nums.length-1);
    }
    public static void main(String[] args) {
        int []nums = { 1,2,3,4,5,6,7};
        rotateArray(nums, 3);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
