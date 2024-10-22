public class DuplicateRemove {
    public static int removeDuplicate(int nums[]){
        int count =1;
        int j=1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]!=nums[i+1]){ 
                nums[count] = nums[i+1]; 
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        int k= removeDuplicate(arr);
        System.out.println(k);
        for(int i=0; i<k; i++ ){
            System.out.print(arr[i]+" ");
        }
    }
}
