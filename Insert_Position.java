public class Insert_Position {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,10};
        int x = 2;
        System.out.println(searchInsert(arr, x));
    }
    static int searchInsert(int []nums, int target){
        if(target < nums[0]){
            return 0;
        }
        else if(target > nums[nums.length-1]){
            return nums.length;
        }
        int pos = 0;
        int min = 0;
        int max = nums.length-1;
        while(min <= max){
            int mid = min + (max-min)/2;
            if(nums[mid] == target){
                pos = mid;
                break;
            }
            else if(nums[mid]<target && target <nums [mid+1]){
                pos = mid+ 1;
                break;
            }
            else if(nums[mid]>target && target>nums [mid-1]){
                pos = mid;
                break;
            }
            else if(nums[mid] < target){
                min = mid+1;
            }
            else{
                max = mid - 1;
            }
        }
        return pos;
    }
}
