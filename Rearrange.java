public class Rearrange {
    public static void main(String[] args) {
        int arr [] = {3,1, -2, -5,2,-4};
        rearrangeArray(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static int[] rearrangeArray(int[] nums) {
        int [] ar = new int [nums.length];
        for(int i=0; i<nums.length ; i++){
            ar[i] = nums[i];
        }
        int k = 0;
        int j = 1;
        for(int i=0; i<nums.length ; i++){
            if (ar[i] < 0){
                nums[j] = ar[i];
                j+=2;
            }
            else if(ar[i] >=0){
                nums[k] = ar[i];
                k+=2;
            }
        }
        return nums;
    }
}
