class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[] = new int [nums.length];
        int arr1[] = new int [nums.length];
        int arr2[] = new int [nums.length];
        int k=1;
        arr1[0]=1;
        arr2[nums.length-1]=1;
        for(int i=1; i<=nums.length-1; i++){
            k=k*nums[i-1];
            arr1[i]=k;
        }
        k=1;
          for(int i= nums.length-2; i>=0; i--){
            k=k*nums[i+1];
            arr2[i]=k;
        }
         for(int i= nums.length-1; i>=0; i--){
            arr[i]=arr1[i]*arr2[i];
         }
          for(int i=0; i< nums.length; i++){
            System.out.print(arr1[i] + " ");
          }
            for(int i=0; i< nums.length; i++){
            System.out.print("arr[2] "+arr2[i] + " ");
          }
         return arr;
    }
}